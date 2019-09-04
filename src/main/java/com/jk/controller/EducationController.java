package com.jk.controller;


import com.jk.pojo.*;
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

    //审核回显
    @RequestMapping("findAuditById")
    @ResponseBody
    public WjfAuditBean findAuditById(Integer id){
        return educationService.findAuditById(id);
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

    //机构
    @RequestMapping("findOrganization")
    @ResponseBody
    public List<WjfOrganizationBean> findOrganization(){
        return educationService.findOrganization();
    }

    // 机构  新增  修改
    @RequestMapping("saveOrganization")
    @ResponseBody
    public Boolean saveOrganization(WjfOrganizationBean wjfOrganizationBean){
        try {
            if(wjfOrganizationBean.getId() != null){
                educationService.updOrganization(wjfOrganizationBean);
            }else{
                educationService.saveOrganization(wjfOrganizationBean);
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //机构回显
    @RequestMapping("findOrganizationById")
    @ResponseBody
    public WjfOrganizationBean findOrganizationById(Integer id){
        return educationService.findOrganizationById(id);
    }

    //删除机构
    @RequestMapping("delOrganization")
    @ResponseBody
    public Boolean delOrganization(Integer id){
        try {
            educationService.delOrganization(id);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    //修改审核
    @RequestMapping("updAudit")
    @ResponseBody
    public Boolean updAudit(WjfAuditBean wjfAuditBean){
        try {
            educationService.updAudit(wjfAuditBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    //修改审核状态
    @RequestMapping("shenhe")
    @ResponseBody
    public Boolean shenhe(Integer id,Integer audit){
        return educationService.shenhe(id,audit);
    }





}
