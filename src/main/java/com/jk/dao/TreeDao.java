package com.jk.dao;

import com.jk.pojo.TreeBean;
import com.jk.pojo.WzxUserBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface TreeDao {


    List<TreeBean> findTreeByPid(int pid, Integer typeid);

    @Select("select * from wzx_user u where u.account =#{value}")
    WzxUserBean findAccount(String account);

    @Insert("Insert into wzx_user(real_name,account,password,mobile,status_id,remark) values(#{real_name},#{account},#{password},#{mobile},1,1)")
    void saveReg(WzxUserBean wzxUserBean);
}