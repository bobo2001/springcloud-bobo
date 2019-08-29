package com.jk.controller;

import com.jk.pojo.Fenrun;
import com.jk.pojo.Lecturer;
import com.jk.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;


@Controller
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    //讲师列表
    @RequestMapping("findLecturer")
    @ResponseBody
    public HashMap<String,Object> findLecturer(Lecturer lecturer){

        return teacherService.findLecturer(lecturer);
    }
    //讲师列表
    @RequestMapping("toLect")
    public String toLect(){

        return "LectList";
    }

    //讲师审核列表
    @RequestMapping("toAuditor")
    public String toAuditor(){
        return "Auditor";
    }
    //讲师分润列表
    @RequestMapping("toFenRun")
    public String toFenRun(){
        return "Fenrun";
    }

    @RequestMapping("findFenRun")
    @ResponseBody
    public HashMap<String,Object> findFenRun(Fenrun fenrun){

     return teacherService.findFenRun(fenrun);
    }

    //修改讲师列表
    @RequestMapping("toupdateLect")
    public String toupdateLect(){

        return "UpdateLect";
    }


    @RequestMapping("saveLect")
    @ResponseBody
    public Boolean saveLect(Lecturer lecturer){
        try{
            teacherService.saveLect(lecturer);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return  false;
        }
    }

}
