package com.jk.dao;

import com.jk.pojo.LclOrderBean;
import com.jk.pojo.LclOrderBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LclMapper {
    int findOrderTotal(@Param("lclOrderBean") LclOrderBean lclOrderBean);
    List<LclOrderBean> findOrderPage(@Param("start") int start, @Param("rows") Integer rows, @Param("lclOrderBean") LclOrderBean lclOrderBean);
}
