package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageControllerWzx {
    @RequestMapping("main")
    public  String  toMain(){
        return "Wzxmain";
    }
    @RequestMapping("toUpRole")
    public  String  toUpRole(){
        return "WzxUpRole";
    }
    @RequestMapping("BpCount")
    public  String  toBpCount(){
        return "WzxBpCount";
    }
    //修改密码
    @RequestMapping("toPassUp")
    public  String  toPassUp(){
        return "WzxPassUp";
    }
    //用户管理页面
    @RequestMapping("user")
    public  String  toUser(){
        return "WzxUser";
    }
    //新增用户页面
    @RequestMapping("toAddUser")
    public  String  toAddUser(){
        return "WzxAddUser";
    }
    //回显用户页面
    @RequestMapping("toUpdateUser")
    public  String  toUpdateUser(){
        return "WzxUpdateUser";
    }
    //角色管理页面
    @RequestMapping("role")
    public  String  toRole(){
        return "WzxRole";
    }
    //角色新增页面
    @RequestMapping("toAddRole")
    public  String  toAddRole(){
        return "WzxAddRole";
    }
    //角色修改页面
    @RequestMapping("toUpdateRole")
    public  String  toUpdateRole(){
        return "WzxUpdateRole";
    }
}
