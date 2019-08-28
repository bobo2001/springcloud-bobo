package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class LclPageController {
    @RequestMapping("lclOrder")
    public String lclOrder() {
        return "lclOrder";
    }

}
