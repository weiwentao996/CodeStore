package com.hero.controller;

import com.google.gson.Gson;
import com.hero.dao.HeroDao;
import com.hero.dao.Impl.HeroDaoImpl;
import com.hero.pojo.Hero;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//涉及到文件上传MultipartConfig
@MultipartConfig
@WebServlet(name = "QueryHeroServlet", value = "/queryHero.do")
public class QueryHeroServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HeroDao heroDao = new HeroDaoImpl();
        List<Hero> heroList = heroDao.queryAllHero();
        System.out.println("-----------------");
        Gson gson = new Gson();
        response.getWriter().write(gson.toJson(heroList));
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
