package com.jk.service;

import com.jk.pojo.*;

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

    List<DiBuBean> findDiBuList();

    void updateDiBu(DiBuBean diBuBean);

    void saveDiBu(DiBuBean diBuBean);

    DiBuBean EditDiBuById(String id);

    void delDiBuByIds(Integer[] ids);

    List<LianJieBean> findLianJieList();

    void updateLianJie(LianJieBean lianJieBean);

    void saveLianJieshow(LianJieBean lianJieBean);

    LianJieBean EditLianJieById(String id);

    void delLianJieByIds(Integer[] ids);

    List<TuiJianBean> findTuiJianList();

    void updateTouBu(TouBuBean touBuBean);

    void saveTouBu(TouBuBean touBuBean);

    TouBuBean EditTouBuById(String id);
}
