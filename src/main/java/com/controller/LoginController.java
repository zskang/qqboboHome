package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/Login")
public class LoginController {

    @RequestMapping("/Login")
    public ModelAndView Login(HttpServletRequest request,
                              HttpServletResponse response) throws Exception {
        ModelAndView mv = new ModelAndView("Login");
        String username = request.getParameter("username");
        String pwd = request.getParameter("username");
        mv.addObject("title", "Hello   !!!" + username + "--" + pwd);
        mv.addObject("content", "以上用户言论只代表其个人观点，不代表网站的观点或立场...");
        return mv;
    }
}

