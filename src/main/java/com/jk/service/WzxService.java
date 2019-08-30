package com.jk.service;

import com.jk.pojo.WzxRoleBean;
import com.jk.pojo.WzxTreeBean;
import com.jk.pojo.WzxUserBean;

import java.util.List;

public interface WzxService {
    List<WzxTreeBean> findTree();
//用户查询
    List<WzxUserBean> findUser(WzxUserBean wzxUserBean);
//用户新增修改
    void saveUser(WzxUserBean wzxUserBean);
//删除用户
    void deleteUser(Integer id);

//回显
    WzxUserBean findUserById(Integer id);
//修改
    void updUser(WzxUserBean wzxUserBean);
//角色查询
    List<WzxRoleBean> findRole(WzxRoleBean wzxRoleBean);
//角色删除
    void deleteRole(Integer id);
//角色新增
    void saveRole(WzxRoleBean wzxRoleBean);
//角色回显
    WzxRoleBean findRoleById(Integer id);
//角色修改
    void updRole(WzxRoleBean wzxRoleBean);
//修改密码
    void upPass(WzxUserBean wzxUserBean);
////查询账号密码
    WzxUserBean findUserAccount(Integer id);
}
