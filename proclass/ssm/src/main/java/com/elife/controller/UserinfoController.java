package com.elife.controller;

import com.elife.pojo.Userinfo;
import com.elife.service.UserinfoService;
import com.elife.vo.ResultData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("user")
public class UserinfoController{
    @Autowired
    UserinfoService userinfoService;

//    @RequestMapping("login")
//    public String login(HttpSession session, String username, String pwd){
//        Userinfo userinfo = userinfoService.login(username,pwd);
//
//        if(null == userinfo) {
//            session.setAttribute("error","用户名或密码错误");
//            return "redirect:/login.jsp";
//        } else {
//            session.setAttribute("user",username);
//            return "redirect:/home.jsp";
//        }
//    }

    @RequestMapping("login")
    @ResponseBody
    public ResultData login(HttpSession session, String username, String pwd){
        Userinfo userinfo = userinfoService.login(username,pwd);
        System.out.println("******************");
        ResultData  resultData = new ResultData();

        if(null == userinfo) {
            resultData.setCode(1);
            resultData.setMessage("用户名或密码错误");
        } else {
            session.setAttribute("user",username);
            resultData.setCode(0);
            resultData.setMessage("成功登陆");
//            resultData.setData(userinfo);
        }
        return resultData;
    }

}
