package com.hero.controller;

import com.google.gson.Gson;
import com.hero.pojo.Hero;
import com.hero.service.HeroService;
import com.hero.service.impl.HeroServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "FindeHeroServlet", value = "/findHero.do")
public class FindeHeroServlet extends HttpServlet {
    HeroService heroService = new HeroServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ukname =  request.getParameter("ukname");
        Hero hero = heroService.findHeroByUKName(ukname);
        Gson gson = new Gson();
        System.out.println(hero.toString());
        response.getWriter().write(gson.toJson(hero));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
