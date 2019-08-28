package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("tree")
    public String tree(){
        return "tree";
    }

    @RequestMapping("login")
    public String login(){
        return "login";
    }


}
