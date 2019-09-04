package com.jk.service;

import com.jk.dao.EducationDao;
import com.jk.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationServiceImpl implements EducationService{

    @Autowired
    private EducationDao educationDao;


    @Override
    public List<WjfCourseBean> findCourse(WjfCourseBean wjfCourseBean) {
        return educationDao.findCourse(wjfCourseBean);
    }

    @Override
    public WjfCourseBean findCourseById(Integer id) {
        return educationDao.findCourseById(id);
    }

    @Override
    public Boolean addCourse(WjfCourseBean wjfCourseBean) {
        return educationDao.addCourse(wjfCourseBean);
    }

    @Override
    public List<WjfAuditBean> findAudit(WjfAuditBean wjfAuditBean) {
        return educationDao.findAudit(wjfAuditBean);
    }

    @Override
    public void shangjia(Integer id) {
        educationDao.shangjia(id);
    }

    @Override
    public void xiajia(Integer id) {
        educationDao.xiajia(id);
    }

    @Override
    public WjfPersonalDetailsBean lingke(Integer id) {
        return educationDao.lingke(id);
    }

    @Override
    public List<WjfOrganizationBean> findOrganization() {
        return educationDao.findOrganization();
    }

    @Override
    public Boolean saveOrganization(WjfOrganizationBean wjfOrganizationBean) {
        return educationDao.saveOrganization(wjfOrganizationBean);
    }

    @Override
    public WjfAuditBean findAuditById(Integer id) {
        return educationDao.findAuditById(id);
    }

    @Override
    public WjfOrganizationBean findOrganizationById(Integer id) {
        return educationDao.findOrganizationById(id);
    }

    @Override
    public void updOrganization(WjfOrganizationBean wjfOrganizationBean) {
        educationDao.updOrganization(wjfOrganizationBean);
    }

    @Override
    public void delOrganization(Integer id) {
        educationDao.delOrganization(id);
    }

    @Override
    public void updAudit(WjfAuditBean wjfAuditBean) {
        educationDao.updAudit(wjfAuditBean);
    }


    @Override
    public Boolean shenhe(Integer id, Integer audit) {
        return educationDao.updAudit1(id,audit);
    }


    @Override
    public List<WjfTree> findTree() {
        int  pid = 0;
        List<WjfTree> list = findNode(pid);
        return list;
    }
    private List<WjfTree> findNode(int pid) {
        List<WjfTree> list = educationDao.findTreeById(pid);
        for (WjfTree WjfTree : list) {
            Integer id = WjfTree.getId();
            List<WjfTree> nodes = findNode(id);
            if(nodes.size()>0){
                WjfTree.setNodes(nodes);
                WjfTree.setSelectable(false);//不能点击
            }else{
                WjfTree.setSelectable(true);//可以点击
            }
        }
        return list;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
