package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("login")
    public String login(Model model) {
        System.out.println("login");
        model.addAttribute("user","USEINFO");
        return "userinfo";
    }
    @RequestMapping("updateuser")
    public String updateUser(Model model) {
        System.out.println("updateUser");
        return "userinfo";
    }
}
