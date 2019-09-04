package com.jk.dao;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface EducationDao {


    List<WjfCourseBean> findCourse(WjfCourseBean wjfCourseBean);

    @Select("select t.id,t.pid,t.text,t.url from wjf_tree t where t.pid = #{value} ")
    List<WjfTree> findTreeById(Integer pid);

    @Select(" select * from wjf_course where id = #{id} ")
    WjfCourseBean findCourseById(Integer id);

    @Update(" UPDATE wjf_course set name = #{name},price = #{price},sort = #{sort},charge = #{charge},detail =#{detail} where id = #{id} ")
    Boolean addCourse(WjfCourseBean wjfCourseBean);

    List<WjfAuditBean> findAudit(WjfAuditBean wjfAuditBean);

    @Update(" UPDATE wjf_audit set standordown = 1 where id = #{id} ")
    void shangjia(Integer id);

    @Update(" UPDATE wjf_audit set standordown = 0 where id = #{id} ")
    void xiajia(Integer id);

    @Select(" select * from wjf_personaldetails where id = #{id} ")
    WjfPersonalDetailsBean lingke(Integer id);

    @Select(" SELECT * from wjf_organization ")
    List<WjfOrganizationBean> findOrganization();

    @Insert(" INSERT INTO wjf_organization (name,area,type,datatime,number) VALUE (#{name},#{area},#{type},#{datatime},#{number}) ")
    Boolean saveOrganization(WjfOrganizationBean wjfOrganizationBean);

    @Select(" select * from wjf_audit where id =  #{id} ")
    WjfAuditBean findAuditById(Integer id);

    @Select(" select * from wjf_organization where id =  #{id} ")
    WjfOrganizationBean findOrganizationById(Integer id);

    @Update(" UPDATE wjf_organization set name = #{name},area = #{area},type = #{type},number = #{number},datatime = #{datatime} where id  = #{id} ")
    void updOrganization(WjfOrganizationBean wjfOrganizationBean);

    @Delete(" delete from wjf_organization where id = #{value} ")
    void delOrganization(Integer id);

    @Update(" UPDATE wjf_audit set name = #{name},price = #{price},sort = #{sort},charge = #{charge},detail =#{detail} where id = #{id} ")
    void updAudit(WjfAuditBean wjfAuditBean);

    @Update(" UPDATE wjf_audit set audit = #{audit} where id = #{id} ")
    Boolean updAudit1(Integer id,Integer audit);





}
