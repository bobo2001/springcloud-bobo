package com.jk.pojo;

import java.io.Serializable;

public class TouBuBean implements Serializable {
    private static final long serialVersionUID = 1646265582799591303L;
    private Integer id;
    private String name;
    private String fangshi;
    private Integer paixu;
    private Integer status;

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

    public String getFangshi() {
        return fangshi;
    }

    public void setFangshi(String fangshi) {
        this.fangshi = fangshi;
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
