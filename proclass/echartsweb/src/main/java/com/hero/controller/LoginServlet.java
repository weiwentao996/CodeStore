package com.hero.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(name = "LoginServlet",value = "/res/login.do")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uname = request.getParameter("uname");
        String pwd = request.getParameter("pwd");
        //  if ("admin".equals(uname)&&"123456".equals(pwd)){
        Cookie cookie = new Cookie("uname", uname);
        cookie.setMaxAge(7*24*60*60);
        response.addCookie(cookie);
        HttpSession session = request.getSession();
        session.setAttribute("uname",uname);
        session.setMaxInactiveInterval(20);
        Object code = session.getAttribute("code");
        String inputCode = request.getParameter("code");
        if (String.valueOf(code).equals(inputCode)){
            /*response.sendRedirect("/MyWork/home.jsp");*/
            request.getRequestDispatcher("/home.jsp").forward(request,response);
        }else {
            System.out.println("erererererer");
            session.setAttribute("message","验证码错误");
            response.sendRedirect("/MyWork/cookie.jsp");
        }
        //Cookie[] cookies = request.getCookies()
        //  }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
