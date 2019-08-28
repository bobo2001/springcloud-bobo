package com.jk.pojo;

import lombok.Data;

import java.util.List;

public class WjfTree {

    private Integer id;

    private Integer pid;

    private  String text;

    private String url;

    private List<WjfTree> nodes;

    private Boolean selectable;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<WjfTree> getNodes() {
        return nodes;
    }

    public void setNodes(List<WjfTree> nodes) {
        this.nodes = nodes;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

}
