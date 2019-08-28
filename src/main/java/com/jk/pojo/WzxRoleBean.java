package com.jk.pojo;

import java.io.Serializable;
import java.math.BigInteger;

public class WzxRoleBean implements Serializable {
    private static final long serialVersionUID = 8671008305926466178L;
    private Integer id;
    private String gmt_create;
    private String gmt_modified;
    private Integer status_id;
    private Integer sort;
    private String role_name;
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

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
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
        return "WzxRoleBean{" +
                "id=" + id +
                ", gmt_create='" + gmt_create + '\'' +
                ", gmt_modified='" + gmt_modified + '\'' +
                ", status_id=" + status_id +
                ", sort=" + sort +
                ", role_name='" + role_name + '\'' +
                ", remark='" + remark + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                '}';
    }
}
