package com.jk.pojo;

import lombok.Data;

@Data
public class LoginUserBean {

    private Integer id;

    private String name;

    private String password;

    private Integer account;

    private String phone;

    private Integer state;

    private Integer beizhu;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getBeizhu() {
        return beizhu;
    }

    public void setBeizhu(Integer beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "LoginUserBean{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", account=" + account +
                ", phone='" + phone + '\'' +
                ", state=" + state +
                ", beizhu=" + beizhu +
                '}';
    }
}
