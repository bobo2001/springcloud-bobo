package com.jk.service;

import com.jk.dao.ZhuanQuDao;
import com.jk.pojo.ShouYeBean;
import com.jk.pojo.TouBuBean;
import com.jk.pojo.ZhuanQuBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ZhuanQuServiceImpl implements ZhuanQuService{
    @Autowired
    private ZhuanQuDao zhuanQuDao;
    @Override
    public List<ZhuanQuBean> findZhuanQuList() {
        return zhuanQuDao.findZhuanQuList();
    }

    @Override
    public void delZhuanQuByIds(Integer[] ids) {
        zhuanQuDao.delZhuanQuByIds(ids);
    }

    @Override
    public List<TouBuBean> findTouBuList() {
        return zhuanQuDao.findTouBuList();
    }

    @Override
    public void delTouBuByIds(Integer[] ids) {
        zhuanQuDao.delTouBuByIds(ids);
    }

    @Override
    public void updateZhuanQu(ZhuanQuBean zhuanQuBean) {
        zhuanQuDao.updateZhuanQu(zhuanQuBean);
    }

    @Override
    public void saveZhuanQu(ZhuanQuBean zhuanQuBean) {
        zhuanQuDao.saveZhuanQu(zhuanQuBean);
    }

    @Override
    public ZhuanQuBean EditZhuanQuById(String id) {
        return zhuanQuDao.EditZhuanQuById(id);
    }

    @Override
    public List<ShouYeBean> findShouYeList() {
        return zhuanQuDao.findShouYeList();
    }

    @Override
    public void saveShouYe(ShouYeBean shouYeBean) {
        zhuanQuDao.saveShouYe(shouYeBean);
    }
}
