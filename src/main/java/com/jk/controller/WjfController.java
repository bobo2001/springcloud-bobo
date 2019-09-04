package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("wjf")
public class WjfController {

    //导航树
    @RequestMapping("towjfmain")
    public String towjfmain(){
        return "wjfmain";
    }

    //课程列表
    @RequestMapping("towjflist")
    public String towjflist(){
        return "wjflist";
    }

    //修改弹框
    @RequestMapping("towjfupdcourse")
    public String towjfupdcourse(){
        return "wjfupdcourse";
    }

    //name弹框
    @RequestMapping("tonamelist")
    public String tonamelist(){
        return "namelist";
    }

    //审核列表
    @RequestMapping("toauditlist")
    public String toauditlist(){
        return "auditlist";
    }

    //领课查询
    @RequestMapping("towjflingke")
    public String towjflingke(){
        return "wjflingke";
    }

    //课程分类页面
    @RequestMapping("towjftypelist")
    public String towjftypelist(){
        return "wjftypelist";
    }

    //机构列表
    @RequestMapping("towjforganization")
    public String towjforganization(){
        return "wjforganization";
    }

    //新增机构
    @RequestMapping("tosaveorganization")
    public String tosaveorganization(){
        return "saveorganization";
    }

    //审核弹框
    @RequestMapping("toupdaudit")
    public String toupdaudit(){
        return "updaudit";
    }


}
