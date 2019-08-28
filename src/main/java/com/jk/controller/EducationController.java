package com.jk.controller;


import com.jk.pojo.WjfAuditBean;
import com.jk.pojo.WjfCourseBean;
import com.jk.pojo.WjfPersonalDetailsBean;
import com.jk.pojo.WjfTree;
import com.jk.service.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping
public class EducationController {

    @Autowired
    private EducationService educationService;

    //导航树
    @RequestMapping("WjfFindTree")
    @ResponseBody
    public List<WjfTree> WjfFindTree(){
       return educationService.findTree();
    }

    //课程查询
    @RequestMapping("findCourse")
    @ResponseBody
    public List<WjfCourseBean> findCourse(WjfCourseBean wjfCourseBean){
        return educationService.findCourse(wjfCourseBean);
    }

    //课程回显
    @RequestMapping("findCourseById")
    @ResponseBody
    public WjfCourseBean findCourseById(Integer id){
        return educationService.findCourseById(id);
    }

    //修改课程
    @RequestMapping("addCourse")
    @ResponseBody
    public Boolean addCourse(WjfCourseBean wjfCourseBean){
        return educationService.addCourse(wjfCourseBean);
    }

    //课程审核列表
    @RequestMapping("findAudit")
    @ResponseBody
    public List<WjfAuditBean> findAudit(WjfAuditBean wjfAuditBean){
        return educationService.findAudit(wjfAuditBean);
    }

    //上架
    @RequestMapping("shangjia")
    @ResponseBody
    public Boolean shangjia(Integer id){
        try {
            educationService.shangjia(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //下架
    @RequestMapping("xiajia")
    @ResponseBody
    public Boolean xiajia(Integer id){
        try {
            educationService.xiajia(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //领课链接查询
    @RequestMapping("lingke")
    @ResponseBody
    public WjfPersonalDetailsBean lingke(Integer id){
        return educationService.lingke(id);
    }




}
