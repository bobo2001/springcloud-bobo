package com.jk.dao;

import com.jk.pojo.WjfAuditBean;
import com.jk.pojo.WjfCourseBean;
import com.jk.pojo.WjfPersonalDetailsBean;
import com.jk.pojo.WjfTree;
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






}
