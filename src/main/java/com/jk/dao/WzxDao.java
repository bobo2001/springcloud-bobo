package com.jk.dao;

import com.jk.pojo.WzxRoleBean;
import com.jk.pojo.WzxTreeBean;
import com.jk.pojo.WzxUserBean;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface WzxDao {
@Select(" select id,pid,text,url from wzx_tree where  pid = #{id}")
    List<WzxTreeBean> getNodes(String id);
//用户查询
    List<WzxUserBean> findUser(WzxUserBean wzxUserBean);
//新增用户
    void saveUser(WzxUserBean wzxUserBean);
    //用户删除
@Delete("delete from wzx_user where id=#{value}")
    void deleteUser(Integer id);
@Select("select * from wzx_user where id=#{value}")
    WzxUserBean findUserById(Integer id);
//用户修改
    void updUser(WzxUserBean wzxUserBean);
//角色查询
    List<WzxRoleBean> findRole(WzxRoleBean wzxRoleBean);
//角色删除
    @Delete("delete from wzx_role where id !=1 and id=#{value}")
    void deleteRole(Integer id);
//角色新增
    void saveRole(WzxRoleBean wzxRoleBean);
//角色回显
    @Select("select * from wzx_role where id=#{value}")
    WzxRoleBean findRoleById(Integer id);
//角色修改
    void updRole(WzxRoleBean wzxRoleBean);
//密码修改
    @Update("update wzx_user set password =#{password} where account=#{account}")
    void upPass(WzxUserBean wzxUserBean);
//查询账号密码

    List<WzxUserBean> findUserAccount(WzxUserBean wzxUserBean);
}
