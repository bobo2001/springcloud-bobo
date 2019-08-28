package com.jk.pojo;

import java.io.Serializable;

public class ShouYeBean implements Serializable {
    private static final long serialVersionUID = 5260488023971889730L;
    private Integer id;
    private String name;
    private String stattime;
    private String endtime;
    private String lianjie;
    private String img;
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

    public String getStattime() {
        return stattime;
    }

    public void setStattime(String stattime) {
        this.stattime = stattime;
    }

    public String getEndtime() {
        return endtime;
    }

    public void setEndtime(String endtime) {
        this.endtime = endtime;
    }

    public String getLianjie() {
        return lianjie;
    }

    public void setLianjie(String lianjie) {
        this.lianjie = lianjie;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
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
