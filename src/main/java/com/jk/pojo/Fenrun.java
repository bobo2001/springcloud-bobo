package com.jk.pojo;

public class Fenrun {
    private Integer id;
    private String teacherName; //讲师名称
    private String creditnumber; //银行卡号
    private String bankName;  //银行名称
    private String bankAccountName;//银行开户名
    private Integer teacherFenRun;//讲师分润
    private Integer platformFenRun;//平台分润
    private Integer status;//状态 1.成功 2.失败
    private String dateTime;
    private Integer page;
    private  Integer rows;
    private String startTime;
    private String endTime;

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
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

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCreditnumber() {
        return creditnumber;
    }

    public void setCreditnumber(String creditnumber) {
        this.creditnumber = creditnumber;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public Integer getTeacherFenRun() {
        return teacherFenRun;
    }

    public void setTeacherFenRun(Integer teacherFenRun) {
        this.teacherFenRun = teacherFenRun;
    }

    public Integer getPlatformFenRun() {
        return platformFenRun;
    }

    public void setPlatformFenRun(Integer platformFenRun) {
        this.platformFenRun = platformFenRun;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "Fenrun{" +
                "id=" + id +
                ", teacherName='" + teacherName + '\'' +
                ", creditnumber='" + creditnumber + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", teacherFenRun=" + teacherFenRun +
                ", platformFenRun=" + platformFenRun +
                ", status=" + status +
                ", dateTime='" + dateTime + '\'' +
                ", page=" + page +
                ", rows=" + rows +
                ", startTime='" + startTime + '\'' +
                ", endTime='" + endTime + '\'' +
                '}';
    }
}
