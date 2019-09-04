package com.hero.controller;

import com.google.gson.Gson;
import com.hero.pojo.HeroSkin;
import com.hero.service.HeroSkinService;
import com.hero.service.impl.HeorSkinServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

@WebServlet(name = "HeroInfoServlet",value = "/heroInfo.do")
public class HeroInfoServlet extends HttpServlet {
    HeroSkinService heroSkinService = new HeorSkinServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ukname = request.getParameter("ukname");
        List<HeroSkin> heroSkinList = heroSkinService.findHeroSkisByUkName(ukname);
        Collections.reverse(heroSkinList);
        System.out.println(heroSkinList.toString());

        Gson gson = new Gson();
        // 向客户端回写数据
        response.getWriter().write(gson.toJson(heroSkinList));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          doPost(request,response);
    }
}
