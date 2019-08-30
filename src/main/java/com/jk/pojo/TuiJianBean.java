package com.jk.pojo;

import java.io.Serializable;

public class TuiJianBean implements Serializable {
    private static final long serialVersionUID = 5711766018335513454L;
    private Integer id;
    private String name;
    private String title;
    private Integer status;
    private Integer paixu;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPaixu() {
        return paixu;
    }

    public void setPaixu(Integer paixu) {
        this.paixu = paixu;
    }
}
