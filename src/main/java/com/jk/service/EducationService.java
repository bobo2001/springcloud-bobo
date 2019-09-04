package com.jk.service;

import com.jk.pojo.*;

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


    List<WjfOrganizationBean> findOrganization();


    Boolean saveOrganization(WjfOrganizationBean wjfOrganizationBean);

    WjfAuditBean findAuditById(Integer id);

    WjfOrganizationBean findOrganizationById(Integer id);


    void updOrganization(WjfOrganizationBean wjfOrganizationBean);


    void delOrganization(Integer id);


    void updAudit(WjfAuditBean wjfAuditBean);


    Boolean shenhe(Integer id, Integer audit);

}
