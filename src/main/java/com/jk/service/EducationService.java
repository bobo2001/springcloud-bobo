package com.jk.service;

import com.jk.pojo.WjfAuditBean;
import com.jk.pojo.WjfCourseBean;
import com.jk.pojo.WjfPersonalDetailsBean;
import com.jk.pojo.WjfTree;

import java.util.List;

public interface EducationService {


    List<WjfCourseBean> findCourse(WjfCourseBean wjfCourseBean);

    List<WjfTree> findTree();

    WjfCourseBean findCourseById(Integer id);

    Boolean addCourse(WjfCourseBean wjfCourseBean);

    List<WjfAuditBean> findAudit(WjfAuditBean wjfAuditBean);

    void shangjia(Integer id);

    void xiajia(Integer id);


    WjfPersonalDetailsBean lingke(Integer id);



}
