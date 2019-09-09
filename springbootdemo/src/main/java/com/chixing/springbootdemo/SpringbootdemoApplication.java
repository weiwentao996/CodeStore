package com.chixing.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SuppressWarnings("all")
@SpringBootApplication
@Controller
public class SpringbootdemoApplication {

    @RequestMapping("testpag")
    public String testPage(){
        return "test.html";
    }
    @RequestMapping("testpag1")
    public String testPage1(){
        return "redirect:test.html";
    }
    @RequestMapping("userinfo")
    public String userInfo(){
        return "user/user.html";
    }
    public static void main(String[] args) {

        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
