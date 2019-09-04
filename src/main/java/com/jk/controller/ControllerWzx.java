package com.jk.controller;

import com.jk.pojo.WzxBpcountBean;
import com.jk.pojo.WzxRoleBean;
import com.jk.pojo.WzxTreeBean;
import com.jk.pojo.WzxUserBean;
import com.jk.service.WzxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@RestController
public class ControllerWzx {
    @Autowired
    private WzxService wzxService;
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping("WzxfindTree")
    public List<WzxTreeBean> findTree() {
        return wzxService.findTree();
    }

    //用户查询
    @RequestMapping("findUser")
    public List<WzxUserBean> findUser(WzxUserBean wzxUserBean) {
        return wzxService.findUser(wzxUserBean);
    }

    //findUserById
    @RequestMapping("findUserById")
    public WzxUserBean findUserById(Integer id) {
        return wzxService.findUserById(id);
    }

    //新增 修改用户
    @RequestMapping("saveUser")
    public Boolean saveUser(WzxUserBean wzxUserBean) {
        try {
            if (wzxUserBean.getId() != null) {
                wzxService.updUser(wzxUserBean);
            } else {

                wzxService.saveUser(wzxUserBean);

            }
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
    }

    //删除用户
    @RequestMapping("deleteUser")
    public Boolean deleteUser(Integer id) {
        try {

            wzxService.deleteUser(id);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
    }

    //findRole 角色查询
    @RequestMapping("findRole")
    public List<WzxRoleBean> findRole(WzxRoleBean wzxRoleBean) {
        return wzxService.findRole(wzxRoleBean);
    }

    //deleteRole 角色删除
    @RequestMapping("deleteRole")
    public Boolean deleteRole(Integer id) {
        try {
            //System.out.println("id = [" + id + "]");
            wzxService.deleteRole(id);

            return true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
    }

    //角色新增 saveRole
//新增 修改角色
    @RequestMapping("saveRole")
    public Boolean saveRole(WzxRoleBean wzxRoleBean) {
        try {
        if(wzxRoleBean.getId()!=null){
            wzxService.updRole(wzxRoleBean);
        }else{
            wzxService.saveRole(wzxRoleBean);

        }
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
    }
//角色回显 findRoleById
@RequestMapping("findRoleById")
public WzxRoleBean findRoleById(Integer id) {
    return wzxService.findRoleById(id);
}
//查询要修改密码的账户  findUserAccount
    @RequestMapping("findUserAccount")
    public  WzxUserBean findUserAccount(Integer id){
        WzxUserBean userAccount = wzxService.findUserAccount(id);
        return userAccount;
    }
    // 修改密码 upPass
    @RequestMapping("upPass")
    public Boolean upPass(WzxUserBean wzxUserBean){
        try {
            wzxService.upPass(wzxUserBean);
            return true;
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
            return false;
        }
    }
    //课程点击次数查询
    //findBpCount
    @RequestMapping("findBpCount")
    public List<WzxBpcountBean> findBpcount(WzxBpcountBean wzxBpcountBean) {
        List<WzxBpcountBean> bpcount = wzxService.findBpcount(wzxBpcountBean);
        List<WzxBpcountBean> bpcountList = new ArrayList<>();
        for(int i=0;i<bpcount.size();i++){
            WzxBpcountBean wzxBpcountBean1 = bpcount.get(i);
            wzxBpcountBean1.setGmt_time1(formatter.format(wzxBpcountBean1.getGmt_time()));
            bpcountList.add(wzxBpcountBean1);
        }
        return bpcountList;
    }
    //查询用户角色 findRoleUser
    @RequestMapping("findRoleUser")
   public WzxRoleBean findRoleUser(Integer id){
        return wzxService.findRoleUser(id);
    }

}
