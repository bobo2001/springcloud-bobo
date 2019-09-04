package com.jk.pojo;

import lombok.Data;

@Data
public class WjfCourseBean {

    private Integer id;

    private String name;//课程名称

    private String type;//课程分类

    private Integer charge;//是否收费

    private Integer price;//原价

    private Integer standordown;//上下架

    private Integer status;//状态

    private Integer sort;//排序

    private String img;//图片

    private String detail;//简介

    private Integer organizationid;

    private String organizationname;


}
