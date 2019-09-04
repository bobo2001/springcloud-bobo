package com.jk.service;

import com.jk.dao.WzxDao;
import com.jk.pojo.WzxBpcountBean;
import com.jk.pojo.WzxRoleBean;
import com.jk.pojo.WzxTreeBean;
import com.jk.pojo.WzxUserBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class WzxServiceImpl implements WzxService{
    @Autowired  private WzxDao wzxDao;
    @Override
    public List<WzxTreeBean> findTree() {
        String id="0";
        List<WzxTreeBean> nodes = getNodes(id);
        return nodes;
    }
//用户查询
    @Override
    public List<WzxUserBean> findUser(WzxUserBean wzxUserBean) {
        return wzxDao.findUser(wzxUserBean);
    }
//用户新增
    @Override
    public void saveUser(WzxUserBean wzxUserBean) {

        String randomFileName = WzxServiceImpl.getRandomFileName();
        System.out.println("随机数 = [" + randomFileName + "]");;
        wzxUserBean.setUser_no(randomFileName);
        wzxDao.saveUser(wzxUserBean);
    }
    public static String getRandomFileName() {

        String str = new SimpleDateFormat("yyyyMMdd").format(new Date());
        int rannum = (int) (new Random().nextDouble() * (99999 - 10000 + 1)) + 10000;// 获取5位随机数
        return str+rannum;// 

    }


//用户删除
    @Override
    public void deleteUser(Integer id) {
        wzxDao.deleteUser(id);
    }
//回显
    @Override
    public WzxUserBean findUserById(Integer id) {
        return wzxDao.findUserById(id);
    }
//用户修改
    @Override
    public void updUser(WzxUserBean wzxUserBean) {
        wzxDao.updUser(wzxUserBean);
    }
//角色查询
    @Override
    public List<WzxRoleBean> findRole(WzxRoleBean wzxRoleBean) {
        return wzxDao.findRole(wzxRoleBean);
    }
//角色删除
    @Override
    public void deleteRole(Integer id) {
        wzxDao.deleteRole(id);
    }
//角色新增
    @Override
    public void saveRole(WzxRoleBean wzxRoleBean) {
        wzxDao.saveRole(wzxRoleBean);
    }
//角色回显
    @Override
    public WzxRoleBean findRoleById(Integer id) {
        return wzxDao.findRoleById(id);
    }
//角色修改
    @Override
    public void updRole(WzxRoleBean wzxRoleBean) {
        wzxDao.updRole(wzxRoleBean);
    }

    @Override
    public void upPass(WzxUserBean wzxUserBean) {
        wzxDao.upPass(wzxUserBean);
    }

    @Override
    public WzxUserBean findUserAccount(Integer id) {
        return wzxDao.findUserAccount(id);
    }
//课程点击查询
    @Override
    public List<WzxBpcountBean> findBpcount(WzxBpcountBean wzxBpcountBean) {
        return wzxDao.findBpcount(wzxBpcountBean);
    }
//用户角色
    @Override
    public WzxRoleBean findRoleUser(Integer id) {
        return wzxDao.findRoleUser(id);
    }


    private List<WzxTreeBean> getNodes(String id) {
        List<WzxTreeBean> trees = wzxDao.getNodes(id);
        for (WzxTreeBean treeBean : trees) {
            List<WzxTreeBean> nodes = getNodes(treeBean.getId());
            if (nodes != null && nodes.size() > 0) {
                treeBean.setLeaf(false);
                treeBean.setSelectable(false);
                treeBean.setNodes(nodes);
            }else{
                treeBean.setLeaf(true);
                treeBean.setSelectable(true);
            }
        }
        return trees;

    }
}
