package com.springmvc.controller;

import com.springmvc.pojo.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class RoleController {

    /**
     * SpringMVC会自动初始化ModelAndView实例
     * 参数传递跟之前讲的一样，再这个参数的后面追加即可
     */
    @RequestMapping("mav")
    public ModelAndView modelAndView1(ModelAndView mav) {
        mav.addObject("usename", "mayun");
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("mm")
    public ModelAndView modelAndView2(ModelMap mm) {
        mm.addAttribute("username", "mayun");
        ModelAndView mav = new ModelAndView("index");
        return mav;
    }

    @RequestMapping("model")
    public ModelAndView modelAndView3(Model model) {
        model.addAttribute("username", "mayun");
        ModelAndView mav = new ModelAndView();
        return mav;
    }

    @RequestMapping("string")
    public String forwardJsp(Model model) {
        model.addAttribute("username", "String");
        //request.setAAttribute("username","String");
        return "index";
    }

    /**
     * 如果是同类内方法地址的转发，不需要加/如forward:forward.do
     * 如果不是再同类内转发，具体根据地址的设计
     *
     * @param model
     * @return
     */
    @RequestMapping("forward")
    public String forwardString(Model model) {
        model.addAttribute("usename", "String");
        //request.setAAttribute("username","String");
        return "forward:index.jsp";
    }

    @RequestMapping("forward1")
    public String forwardString1(Model model) {
        model.addAttribute("usename", "String");
        //request.setAAttribute("username","String");
        return "forward:/index.jsp";
    }

    @RequestMapping("forward2")
    public String forwardString2(Model model) {
        model.addAttribute("usename", "String");
        //request.setAAttribute("username","String");
        return "forward:/WEB-INF/index.jsp";
    }

    @RequestMapping("request")
    public void forwardString2(HttpServletRequest request, HttpServletResponse response) {
        request.setAttribute("usename", "String");
        //request.setAAttribute("username","String");
        try {
            request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("redirect")
    public String redirect() {
        return "redirect:/springmvc/WEB-INF/paramerter.jsp";
    }

    @RequestMapping("redirect1")
    public String redirect1() {
        return "redirect:/paramerter.jsp";
    }

    @RequestMapping("redirect2")
    public ModelAndView redirect2(ModelAndView modelAndView) {
        modelAndView.setViewName("redirect:/WEB-INF/paramerter.jsp");
        return modelAndView;
    }

    @RequestMapping("redirect3")
    public String redirect3(RedirectAttributes redirectAttributes) {
        redirectAttributes.addAttribute("id", 100);
        redirectAttributes.addAttribute("name", "dddl");
        redirectAttributes.addAttribute("note", "导演");
        return "redirect:/paramerter.jsp";
    }

    @RequestMapping("redirect4")
    public String redirect4(RedirectAttributes redirectAttributes) {
        Role role = new Role();
        role.setId(10);
        role.setName("sss");
        role.setNote("Sfgghfdg");
        redirectAttributes.addFlashAttribute("role", role);
        return "redirect:paramerter.do";
    }

    @RequestMapping("parameter")
    public String redirect5(Model model, @SessionAttribute("role") Role role) {
        model.addAttribute("role", role);
        return "redirect:paramerter.do";
    }

}