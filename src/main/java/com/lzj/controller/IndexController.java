package com.lzj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {
    @RequestMapping("login")
    public  String login(){
        return "login";
    }

    @RequestMapping("index")
    public  String index(HttpServletRequest request){
        request.setAttribute("ctx",request.getContextPath());
        return  "index";
    }

    @RequestMapping("success")
    public  String success(){
        return  "success";
    }
    @RequestMapping("failed")
    public  String failed(){
        return  "failed";
    }

    /*@RequestMapping("doLogin")
    public  void doLogin(String username,String password){
        System.out.println("用户登录操作。。。"+username+"--"+password);
    }*/
}
