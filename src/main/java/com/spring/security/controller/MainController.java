package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("api/")
public class MainController {
    @GetMapping("main")
    public String login(){
        return "index";
    }

    @GetMapping("profile")
    public String profile(){
        return "profile/index";
    }
    @GetMapping("mange")
    public String mange(){
        return "managment/index";
    }
    @GetMapping("admin")
    public String admin(){
        return "admin/index";
    }
}
