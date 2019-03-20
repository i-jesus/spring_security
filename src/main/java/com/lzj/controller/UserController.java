package com.lzj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {
    @RequestMapping("index")
    public  String index(){
        return "user";
    }

    @RequestMapping("details")
    public  String details(){
        return "user_details";
    }
}
