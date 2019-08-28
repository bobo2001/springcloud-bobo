package com.jk.pojo;

import java.io.Serializable;

public class LclOrderBean  {
    private Integer id;
    private Long orderNumber;  //订单号
    private String courseInfo;  //课程信息
    private String teacherInfo;  //讲师信息
    private String userInfo;  //用户信息
    private Integer dealType;    //交易类型
    private Integer payType;    //支付方式
    private Integer orderPrice;    //支付金额
    private Integer buyType;    //购买方式
    private Integer orderStatus;   //订单状态
    private String peopleRemarks;   //客户备注
    private String payTime;         //支付时间
    private  String  startTime;
    private  String  endTime;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getCourseInfo() {
        return courseInfo;
    }

    public void setCourseInfo(String courseInfo) {
        this.courseInfo = courseInfo;
    }

    public String getTeacherInfo() {
        return teacherInfo;
    }

    public void setTeacherInfo(String teacherInfo) {
        this.teacherInfo = teacherInfo;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public Integer getDealType() {
        return dealType;
    }

    public void setDealType(Integer dealType) {
        this.dealType = dealType;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "LclOrderBean{" +
                "id=" + id +
                ", orderNumber=" + orderNumber +
                ", courseInfo='" + courseInfo + '\'' +
                ", teacherInfo='" + teacherInfo + '\'' +
                ", userInfo='" + userInfo + '\'' +
                ", dealType=" + dealType +
                ", payType=" + payType +
                ", orderPrice=" + orderPrice +
                ", buyType=" + buyType +
                ", orderStatus=" + orderStatus +
                ", peopleRemarks='" + peopleRemarks + '\'' +
                ", payTime='" + payTime + '\'' +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getBuyType() {
        return buyType;
    }

    public void setBuyType(Integer buyType) {
        this.buyType = buyType;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getPeopleRemarks() {
        return peopleRemarks;
    }

    public void setPeopleRemarks(String peopleRemarks) {
        this.peopleRemarks = peopleRemarks;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

}