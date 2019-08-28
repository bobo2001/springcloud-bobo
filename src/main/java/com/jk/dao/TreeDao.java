package com.jk.dao;

import com.jk.pojo.LoginUserBean;
import com.jk.pojo.TreeBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TreeDao {


    List<TreeBean> findTreeByPid(int pid, Integer typeid);

    @Select("select * from user_login u where u.account =#{value}")
    LoginUserBean findAccount(Integer account);

    @Insert("Insert into user_login(name,account,password,phone,stats,beizhu) values(#{name},#{account},#{password},#{phone},1,1)")
    void saveReg(LoginUserBean userBean);
}