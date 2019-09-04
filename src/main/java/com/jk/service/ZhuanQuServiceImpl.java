package com.jk.service;

import com.jk.dao.ZhuanQuDao;
import com.jk.pojo.*;
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

    @Override
    public List<DiBuBean> findDiBuList() {
        return zhuanQuDao.findDiBuList();
    }

    @Override
    public void updateDiBu(DiBuBean diBuBean) {
        zhuanQuDao.updateDiBu(diBuBean);
    }

    @Override
    public void saveDiBu(DiBuBean diBuBean) {
        zhuanQuDao.saveDiBu(diBuBean);
    }

    @Override
    public DiBuBean EditDiBuById(String id) {
        return zhuanQuDao.EditDiBuById(id);
    }

    @Override
    public void delDiBuByIds(Integer[] ids) {
        zhuanQuDao.delDiBuByIds(ids);
    }

    @Override
    public List<LianJieBean> findLianJieList() {
        return zhuanQuDao.findLianJieList();
    }

    @Override
    public void updateLianJie(LianJieBean lianJieBean) {
        zhuanQuDao.updateLianJie(lianJieBean);
    }

    @Override
    public void saveLianJieshow(LianJieBean lianJieBean) {
        zhuanQuDao.saveLianJieshow(lianJieBean);
    }

    @Override
    public LianJieBean EditLianJieById(String id) {
        return zhuanQuDao.EditLianJieById(id);
    }

    @Override
    public void delLianJieByIds(Integer[] ids) {
        zhuanQuDao.delLianJieByIds(ids);
    }

    @Override
    public List<TuiJianBean> findTuiJianList() {
        return zhuanQuDao.findTuiJianList();
    }

    @Override
    public void updateTouBu(TouBuBean touBuBean) {
        zhuanQuDao.updateTouBu(touBuBean);
    }

    @Override
    public void saveTouBu(TouBuBean touBuBean) {
        zhuanQuDao.saveTouBu(touBuBean);
    }

    @Override
    public TouBuBean EditTouBuById(String id) {
        return zhuanQuDao.EditTouBuById(id);
    }
}
