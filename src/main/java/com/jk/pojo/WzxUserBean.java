package com.jk.pojo;

import java.io.Serializable;
import java.math.BigInteger;

public class WzxUserBean implements Serializable {
    private static final long serialVersionUID = -4361620530110979640L;
            /* `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
            `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
            `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
            `status_id` tinyint(3) unsigned NOT NULL DEFAULT '1' COMMENT '状态(1:正常，0:禁用)',
            `sort` int(11) unsigned NOT NULL DEFAULT '1' COMMENT '排序',
            `user_no` bigint(20) NOT NULL COMMENT '用户编号',
            `mobile` char(11) NOT NULL DEFAULT '' COMMENT '手机',
            `real_name` varchar(50) NOT NULL COMMENT '真实姓名',
            `remark` varchar(255) DEFAULT NULL COMMENT '备注',*/
    private Integer id;
    private String gmt_create;
    private String gmt_modified;
    private Integer status_id;
    private Integer sort;
    private BigInteger user_no;
    private String mobile;
    private String real_name;
    private String remark;
   private Integer page;
   private Integer rows;
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(String gmt_create) {
        this.gmt_create = gmt_create;
    }

    public String getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(String gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Integer getStatus_id() {
        return status_id;
    }

    public void setStatus_id(Integer status_id) {
        this.status_id = status_id;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public BigInteger getUser_no() {
        return user_no;
    }

    public void setUser_no(BigInteger user_no) {
        this.user_no = user_no;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getReal_name() {
        return real_name;
    }

    public void setReal_name(String real_name) {
        this.real_name = real_name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "WzxUserBean{" +
                "id=" + id +
                ", gmt_create='" + gmt_create + '\'' +
                ", gmt_modified='" + gmt_modified + '\'' +
                ", status_id=" + status_id +
                ", sort=" + sort +
                ", user_no=" + user_no +
                ", mobile='" + mobile + '\'' +
                ", real_name='" + real_name + '\'' +
                ", remark='" + remark + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }
}
