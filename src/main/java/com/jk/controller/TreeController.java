package com.jk.controller;

import com.jk.pojo.LoginUserBean;
import com.jk.pojo.TreeBean;
import com.jk.service.TreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class TreeController {

    @Autowired
    private TreeService treeService;

    @RequestMapping("findTree")
    public List<TreeBean> findTree(Integer typeid){

        List<TreeBean> tree = treeService.findTree(typeid);

        return tree;
    }

    @RequestMapping("login")
    public HashMap<String,Object> loginUser(LoginUserBean userBean) {
        return treeService.LoginUser(userBean);
    }

    @RequestMapping("saveReg")
    public boolean saveReg(LoginUserBean userBean) {
        try {
            treeService.saveReg(userBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


}
