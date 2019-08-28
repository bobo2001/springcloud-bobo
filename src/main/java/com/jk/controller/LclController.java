package com.jk.controller;

import com.jk.pojo.LclOrderBean;
import com.jk.service.LclService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

@Controller
@RequestMapping("order")
public class LclController {
    @Autowired
    private LclService       lclService;
    @RequestMapping("findOrder")
    @ResponseBody

    public HashMap<String, Object> findOrder(LclOrderBean lclOrderBean, Integer  page, Integer rows){

        return  lclService.findOrder(page,rows,lclOrderBean);
    }
}
