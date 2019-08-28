package com.jk.service;

import com.jk.pojo.ShouYeBean;
import com.jk.pojo.TouBuBean;
import com.jk.pojo.ZhuanQuBean;

import java.util.List;

public interface ZhuanQuService {
    List<ZhuanQuBean> findZhuanQuList();

    void delZhuanQuByIds(Integer[] ids);

    List<TouBuBean> findTouBuList();

    void delTouBuByIds(Integer[] ids);

    void updateZhuanQu(ZhuanQuBean zhuanQuBean);

    void saveZhuanQu(ZhuanQuBean zhuanQuBean);

    ZhuanQuBean EditZhuanQuById(String id);

    List<ShouYeBean> findShouYeList();

    void saveShouYe(ShouYeBean shouYeBean);
}
