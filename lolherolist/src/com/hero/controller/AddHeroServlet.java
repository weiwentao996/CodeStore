package com.hero.controller;


import com.hero.pojo.Hero;
import com.hero.service.HeroService;
import com.hero.service.impl.HeroServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.util.UUID;

//涉及到文件上传MultipartConfig
@MultipartConfig
@WebServlet(name = "AddHeroServlet", value = "/addHero.do")
public class AddHeroServlet extends HttpServlet {
    HeroService heroService = new HeroServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String ukname = request.getParameter("ukname");
        String nickName = request.getParameter("nickname");
        //文本信息的获取在图片获取之前执行
        Part part = request.getPart("tinyimg");
        if (part.getSize() == 0) {
            response.getWriter().write("插入失败");
        }else{
            String name = part.getSubmittedFileName();
            //获取文件的后缀
            String str = name.substring(name.lastIndexOf("."));
            System.out.println("测试获取文件的后缀：" + str);
            String filename1 = UUID.randomUUID().toString() + str;
            String filename = "D:/lolherolist/web/img/" + filename1;
            part.write(filename);
            Hero hero = new Hero();
            hero.setUkName(ukname);
            hero.setNickname(nickName);
            hero.setTinyImg("img/" + filename1);
            int num = 0;
            num = heroService.insertHero(hero);
            if (num != 0) {
                response.getWriter().write("英雄插入成功：" + "---" + ukname + "---" + nickName + "---" + "filename:" + filename);
            } else {
                System.out.println("英雄插入失败！");
            }
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
