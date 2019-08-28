package com.jk.service;

import com.jk.dao.TreeDao;
import com.jk.pojo.LoginUserBean;
import com.jk.pojo.TreeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class TreeServiceImpl implements TreeService {

    @Autowired
    private TreeDao treeDao;


    @Override
    public List<TreeBean> findTree(Integer typeid) {
        int pid=0;
        List<TreeBean> list = findNode(pid,typeid);
        return list;
    }

    @Override
    public HashMap<String, Object> LoginUser(LoginUserBean userBean) {
        HashMap<String, Object> hashMap = new HashMap<>();
        LoginUserBean user = treeDao.findAccount(userBean.getAccount());
        if (user == null) {
            hashMap.put("code", 1);
            hashMap.put("msg", "账号错误！");
            return hashMap;
        }
        String passeword = user.getPassword();
        String password = userBean.getPassword();
        //  String md516 = Md5Util.getMd516(passeword);
        if (!passeword.equals(password)) {
            hashMap.put("code", 2);
            hashMap.put("msg", "密码错误！");
            return hashMap;
        }
        //session.setAttribute(session.getId(), user);
        hashMap.put("code", 0);
        hashMap.put("msg", "登陆成功");
        return hashMap;
    }

    @Override
    public void saveReg(LoginUserBean userBean) {
        treeDao.saveReg(userBean);
    }


    private List<TreeBean> findNode(int pid, Integer typeid) {
        //通过pid查找到树的List
        List<TreeBean> list= treeDao.findTreeByPid(pid,typeid);
        //循环查到的List
        for (TreeBean treeBean : list) {
            //取出查到的这个Pid数据的ID
            Integer id = treeBean.getId();
            //把查到的这个Id拿着去后台继续查询Pid 符合这个ID的也就是说明一下这些就是这个Id的子节点
            List<TreeBean> findNode = findNode(id,typeid);
            //判断如果没有子节点就不能有加减号
            if (findNode.size()>0) {//大于零说明有子节点
                treeBean.setNodes(findNode);
                treeBean.setSelectable(false);//设置不能点击
            }else{
                treeBean.setSelectable(true);//设置可以点击
            }
        }
        return list;
    }
}
