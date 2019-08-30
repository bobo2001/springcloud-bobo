package com.jk.pojo;

public class Lecturer {

    private Integer id;
    private String phone;  //电话
    private String teacheName;//讲师名称
    private String email;//邮箱
    private Integer status;//状态:1正常 2.禁用
    private String proportion; //分成比例
    private Integer audit; //审核情况:1.待审核 2.审核通过 3.审核不通过
    private String lecturership; //讲师职位
    private Integer sorting;//讲师排序
    private String info;//讲师简介
    private String blankName;//银行名称
    private String creditNumber;//银行卡号
    private String accountName;//开户名称
    private String identity;//身份证号
    private String branch;//支行名称
    private Integer page;
    private Integer rows;

    @Override
    public String toString() {
        return "Lecturer{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", teacheName='" + teacheName + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", proportion='" + proportion + '\'' +
                ", audit=" + audit +
                ", lecturership='" + lecturership + '\'' +
                ", sorting=" + sorting +
                ", info='" + info + '\'' +
                ", blankName='" + blankName + '\'' +
                ", creditNumber='" + creditNumber + '\'' +
                ", accountName='" + accountName + '\'' +
                ", identity='" + identity + '\'' +
                ", branch='" + branch + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                '}';
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeacheName() {
        return teacheName;
    }

    public void setTeacheName(String teacheName) {
        this.teacheName = teacheName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getProportion() {
        return proportion;
    }

    public void setProportion(String proportion) {
        this.proportion = proportion;
    }

    public Integer getAudit() {
        return audit;
    }

    public void setAudit(Integer audit) {
        this.audit = audit;
    }

    public String getLecturership() {
        return lecturership;
    }

    public void setLecturership(String lecturership) {
        this.lecturership = lecturership;
    }

    public Integer getSorting() {
        return sorting;
    }

    public void setSorting(Integer sorting) {
        this.sorting = sorting;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getBlankName() {
        return blankName;
    }

    public void setBlankName(String blankName) {
        this.blankName = blankName;
    }

    public String getCreditNumber() {
        return creditNumber;
    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }
}
