package com.jk.controller;

import com.jk.pojo.WzxRoleBean;
import com.jk.pojo.WzxTreeBean;
import com.jk.pojo.WzxUserBean;
import com.jk.service.WzxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ControllerWzx {
    @Autowired
    private WzxService wzxService;

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
    public  List<WzxUserBean> findUserAccount(WzxUserBean wzxUserBean){
        return wzxService.findUserAccount(wzxUserBean);
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
}
