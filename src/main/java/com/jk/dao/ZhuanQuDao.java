package com.jk.dao;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface  ZhuanQuDao {

    @Select("select * from sh_zhuanqu")

    List<ZhuanQuBean> findZhuanQuList();

    void delZhuanQuByIds(Integer[] ids);

    @Select("select * from sh_toubu")

    List<TouBuBean> findTouBuList();

    void delTouBuByIds(Integer[] ids);
    @Update("update sh_zhuanqu set name=#{name},title=#{title},paixu=#{paixu},status=#{status} where id=#{id}")
    void updateZhuanQu(ZhuanQuBean zhuanQuBean);
    @Insert("insert into sh_zhuanqu (name,title,paixu,status) values(#{name},#{title},#{paixu},#{status})")
    void saveZhuanQu(ZhuanQuBean zhuanQuBean);
    @Select("select * from sh_zhuanqu where id=#{value}")
    ZhuanQuBean EditZhuanQuById(String id);
    @Select("select * from sh_shouye")
    List<ShouYeBean> findShouYeList();
    @Insert("insert into sh_zhuanqu (name,paixu,stattime,status,endtime,lianjie,img) values(#{name},#{stattime},#{endtime},#{paixu},#{lianjie},#{img},#{status})")
    void saveShouYe(ShouYeBean shouYeBean);
    @Select("select * from sh_dibu")
    List<DiBuBean> findDiBuList();
    @Update("update sh_dibu set name=#{name},paixu=#{paixu},status=#{status} where id=#{id}")
    void updateDiBu(DiBuBean diBuBean);
    @Insert("insert into sh_dibu (name,paixu,status) values(#{name},#{paixu},#{status})")
    void saveDiBu(DiBuBean diBuBean);
    @Select("select * from sh_dibu where id=#{value}")
    DiBuBean EditDiBuById(String id);

    void delDiBuByIds(Integer[] ids);
    @Select("select * from sh_lianjie")
    List<LianJieBean> findLianJieList();
    @Update("update sh_lianjie set name=#{name},paixu=#{paixu},status=#{status},url=#{url} where id=#{id}")
    void updateLianJie(LianJieBean lianJieBean);
    @Insert("insert into sh_lianjie (name,paixu,status,url) values(#{name},#{paixu},#{status},#{url})")
    void saveLianJieshow(LianJieBean lianJieBean);
    @Select("select * from sh_lianjie where id=#{value}")
    LianJieBean EditLianJieById(String id);

    void delLianJieByIds(Integer[] ids);
    @Select("select * from sh_tuijian")
    List<TuiJianBean> findTuiJianList();
    @Update("update sh_toubu set name=#{name},paixu=#{paixu},status=#{status},fangshi=#{fangshi} where id=#{id}")
    void updateTouBu(TouBuBean touBuBean);
    @Insert("insert into sh_toubu (name,paixu,status,fangshi) values(#{name},#{paixu},#{status}#{fangshi})")
    void saveTouBu(TouBuBean touBuBean);
    @Select("select * from sh_toubu where id=#{value}")
    TouBuBean EditTouBuById(String id);
    @Update("update sh_shouye set status = 0 where id =#{id}")
    void shangjia(Integer id);
    @Update("update sh_shouye set status = 1 where id =#{id}")
    void xiajia(Integer id);
    @Update("update sh_zhuanqu set status = 1 where id =#{id}")
    void zhuanqushangjia(Integer id);
    @Update("update sh_zhuanqu set status = 0 where id =#{id}")
    void zhuanquxiajia(Integer id);
    @Update("update sh_dibu set status = 1 where id =#{id}")
    void dibushangjia(Integer id);
    @Update("update sh_dibu set status = 0 where id =#{id}")
    void dibuxiajia(Integer id);
    @Update("update sh_toubu set status = 1 where id =#{id}")
    void toubushangjia(Integer id);
    @Update("update sh_toubu set status = 0 where id =#{id}")
    void toubuxiajia(Integer id);
    @Update("update sh_lianjie set status = 1 where id =#{id}")
    void lianjieshangjia(Integer id);
    @Update("update sh_lianjie set status = 0 where id =#{id}")
    void lianjiexiajia(Integer id);

    void delShouYeByIds(Integer[] ids);
}
