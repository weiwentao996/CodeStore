package com.springmvc.controller;

import com.springmvc.pojo.Role;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    // 表示当请求为/login（考虑到Spring MVC中拦截地址/login.do）时才会触发执行该方法
    @RequestMapping(value = "login")
    public ModelAndView login() {
// 根据ds-servlet配置文件的配置,会定位到/WEB-INF/test.jsp文件用于显示
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("usename", "zxx");
        //request.setAttribute("username",""zxx)
        return modelAndView;
    }

    @RequestMapping(value = "byreqobj")
    public ModelAndView byRequestObject(HttpServletRequest request) {
        //获取请求的参数
        String role = request.getParameter("role");

        // 根据ds-servlet配置文件的配置,会定位到/WEB-INF/test.jsp文件用于显示
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("usename", role);
        //request.setAttribute("username",""zxx)
        return modelAndView;
    }

    @RequestMapping(value = "byPojo")
    public ModelAndView byRequestPojo(Role role) {
        //获取请求的参数

        // 根据ds-servlet配置文件的配置,会定位到/WEB-INF/test.jsp文件用于显示
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("usename", role.toString());
        //request.setAttribute("username",""zxx)
        return modelAndView;
    }

    @RequestMapping("byannotation")
    public ModelAndView byannotation(@RequestParam("roleName") String role) {
        //获取请求的参数

        // 根据ds-servlet配置文件的配置,会定位到/WEB-INF/test.jsp文件用于显示
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("usename", role);
        //request.setAttribute("username",""zxx)
        return modelAndView;
    }

    @RequestMapping("byrestful/{id}")
    public ModelAndView byRestful1(@PathVariable("id") Integer id) {
        //调用service层实现对id的查询，实现略
        // 根据ds-servlet配置文件的配置,会定位到/WEB-INF/test.jsp文件用于显示
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("usename", id);
        //request.setAttribute("username",""zxx)
        return modelAndView;
    }

    @RequestMapping(value = "byrestful2/{table}/{id}")
    public ModelAndView byRestful2(@PathVariable("table") String table, @PathVariable("id") Integer id) {
        //调用service层实现对id的查询，实现略
        // 根据ds-servlet配置文件的配置,会定位到/WEB-INF/test.jsp文件用于显示
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("usename", table + "," + id);
        //request.setAttribute("username",""zxx)
        return modelAndView;
    }

    @RequestMapping("byresponsejson")
    @ResponseBody
    public Role byRestful2(Integer id) {
        //调用service层实现对id的查询，实现略
        // 根据ds-servlet配置文件的配置,会定位到/WEB-INF/test.jsp文件用于显示
        Role role = new Role();
        role.setId(id);
        role.setName("马化腾");
        role.setNote("王者荣耀");
        return role;
    }
    @RequestMapping("byrequestjson")
    @ResponseBody
    public ModelAndView byRequestJson(@RequestBody Role role) {
        //调用service层实现对id的查询，实现略
        // 根据ds-servlet配置文件的配置,会定位到/WEB-INF/test.jsp文件用于显示
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("usename",role);
        return  modelAndView;
    }


}
