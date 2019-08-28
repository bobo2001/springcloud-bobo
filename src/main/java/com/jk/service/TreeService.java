package com.jk.service;

import com.jk.pojo.TreeBean;
import com.jk.pojo.WzxUserBean;

import java.util.HashMap;
import java.util.List;

public interface TreeService {


    List<TreeBean> findTree(Integer typeid);

    HashMap<String, Object> LoginUser(WzxUserBean wzxUserBean);

    void saveReg(WzxUserBean wzxUserBean);
}
