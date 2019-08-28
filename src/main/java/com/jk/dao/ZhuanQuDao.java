package com.jk.dao;

import com.jk.pojo.ShouYeBean;
import com.jk.pojo.TouBuBean;
import com.jk.pojo.ZhuanQuBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface ZhuanQuDao {

    @Select("select * from sh_zhuanqu")

    List<ZhuanQuBean> findZhuanQuList();

    void delZhuanQuByIds(Integer[] ids);

    @Select("select * from sh_toubu")

    List<TouBuBean> findTouBuList();

    void delTouBuByIds(Integer[] ids);
    @Update("update sh_zhuanqu set name=#{name},title=#{title},paixu=#{paixu},status=#{1} where id=#{id}")
    void updateZhuanQu(ZhuanQuBean zhuanQuBean);
    @Insert("insert into sh_zhuanqu (name,title,paixu,status) values(#{name},#{title},#{paixu},#{status})")
    void saveZhuanQu(ZhuanQuBean zhuanQuBean);
    @Select("select * from sh_zhuanqu where id=#{value}")
    ZhuanQuBean EditZhuanQuById(String id);
    @Select("select * from sh_shouye")
    List<ShouYeBean> findShouYeList();
    @Insert("insert into sh_zhuanqu (name,paixu,stattime,status,endtime,lianjie,img) values(#{name},#{stattime},#{endtime},#{paixu},#{lianjie},#{img},#{status})")
    void saveShouYe(ShouYeBean shouYeBean);
}
