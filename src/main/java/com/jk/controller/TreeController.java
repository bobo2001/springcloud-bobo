package com.jk.controller;

import com.jk.pojo.TreeBean;
import com.jk.pojo.WzxUserBean;
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
    public HashMap<String,Object> loginUser(WzxUserBean wzxUserBean) {
        return treeService.LoginUser(wzxUserBean);
    }

    @RequestMapping("saveReg")
    public boolean saveReg(WzxUserBean wzxUserBean) {
        try {
            treeService.saveReg(wzxUserBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }


}
