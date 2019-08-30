package com.jk.pojo;

import java.io.Serializable;

public class LianJieBean implements Serializable {
    private static final long serialVersionUID = -5314209586825606262L;
    private Integer id;
    private String name;
    private String url;
    private Integer paixu;
    private Integer status;
    private String nameurl;//nameurl=name+url   在前台输入nameurl  就能把它们展示在一个字段内

    public String getNameurl() {
        return nameurl;
    }

    public void setNameurl(String nameurl) {
        this.nameurl = nameurl;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPaixu() {
        return paixu;
    }

    public void setPaixu(Integer paixu) {
        this.paixu = paixu;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
