package com.hero.controller;

import com.google.gson.Gson;
import com.hero.pojo.Hero;
import com.hero.pojo.Ht;
import com.hero.service.HeroService;
import com.hero.service.HtService;
import com.hero.service.impl.HeroServiceImpl;
import com.hero.service.impl.HtServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * controller:
 * 接收用户请求
 * 请求处理：转发与重定向
 * 调用Service层完成数据交互
 *
 * MVC：Model 模型     View  视图    Controller  控制器
 * URL-》Controller《-》Model(Service Dao Pojo)
 *       Controller-》View显示
 *
 * 解耦
 *
 * 餐厅： 前台   后厨   服务员
 *  维护起来很方便
 *
 */
@WebServlet(name = "QueryHeroServlet", value = "/queryHero.do")
public class QueryHeroServlet extends HttpServlet {
    HeroService heroService = new HeroServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Hero> heroList = heroService.findAllHero();
        Gson gson = new Gson();
        // 向客户端回写数据
        response.getWriter().write(gson.toJson(heroList));
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         doPost(request, response);
    }
}
