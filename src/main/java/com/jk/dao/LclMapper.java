package com.jk.dao;

import com.jk.pojo.LclOrderBean;
import com.jk.pojo.LclOrderBean;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface LclMapper {
    int findOrderTotal(@Param("lclOrderBean") LclOrderBean lclOrderBean);
    List<LclOrderBean> findOrderPage(@Param("start") int start, @Param("rows") Integer rows, @Param("lclOrderBean") LclOrderBean lclOrderBean);
    @Select("select * from lcl_order")
    List<LclOrderBean> findCommodity();
    @Update("update  lcl_order  set orderNumber=#{orderNumber},courseInfo=#{courseInfo},teacherInfo=#{teacherInfo}," +
            "userInfo=#{userInfo},dealType=#{dealType},payType=#{payType},orderPrice=#{orderPrice}," +
            "buyType=#{buyType},orderStatus=#{orderStatus},peopleRemarks=#{peopleRemarks},payTime=#{payTime} where id=#{id}")
    void updateOrder(LclOrderBean lclOrderBean);
    @Insert("insert into lcl_order (orderNumber,courseInfo,teacherInfo,userInfo,dealType,payType," +
            "orderPrice,buyType,orderStatus,peopleRemarks,payTime) values() ")
    void saveOrder(LclOrderBean lclOrderBean);
    @Select("select * from lcl_order where id=#{value}")
    LclOrderBean findOrderById(String id);
}
