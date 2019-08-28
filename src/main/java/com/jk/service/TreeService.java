package com.jk.service;

import com.jk.pojo.LoginUserBean;
import com.jk.pojo.TreeBean;

import java.util.HashMap;
import java.util.List;

public interface TreeService {


    List<TreeBean> findTree(Integer typeid);

    HashMap<String, Object> LoginUser(LoginUserBean userBean);

    void saveReg(LoginUserBean userBean);
}
