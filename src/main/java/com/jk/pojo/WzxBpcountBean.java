package com.jk.pojo;

import java.io.Serializable;
import java.util.Date;

public class WzxBpcountBean implements Serializable {
    private Integer id;
    private String gmt_create;
    private String gmt_modified;
    private Date gmt_time;
    private String gmt_time1;
    private String name;
    private Integer count;

    public String getGmt_time1() {
        return gmt_time1;
    }

    public void setGmt_time1(String gmt_time1) {
        this.gmt_time1 = gmt_time1;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getGmt_time() {
        return gmt_time;
    }

    public void setGmt_time(Date gmt_time) {
        this.gmt_time = gmt_time;
    }

    @Override
    public String toString() {
        return "WzxBpcountBean{" +
                "id=" + id +
                ", gmt_create='" + gmt_create + '\'' +
                ", gmt_modified='" + gmt_modified + '\'' +
                ", gmt_time='" + gmt_time + '\'' +
                ", name='" + name + '\'' +
                ", count=" + count +
                '}';
    }
}
