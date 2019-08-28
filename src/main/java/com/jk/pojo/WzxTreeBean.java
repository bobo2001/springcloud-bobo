package com.jk.pojo;

import java.util.List;

public class WzxTreeBean {  private String id;

    private String text;

    private String pid;

    private String url;

    private Boolean leaf;

    private Boolean selectable;

    private List<WzxTreeBean> nodes;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getLeaf() {
        return leaf;
    }

    public void setLeaf(Boolean leaf) {
        this.leaf = leaf;
    }

    public Boolean getSelectable() {
        return selectable;
    }

    public void setSelectable(Boolean selectable) {
        this.selectable = selectable;
    }

    public List<WzxTreeBean> getNodes() {
        return nodes;
    }

    public void setNodes(List<WzxTreeBean> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return "WzxTreeBean{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", pid='" + pid + '\'' +
                ", url='" + url + '\'' +
                ", leaf=" + leaf +
                ", selectable=" + selectable +
                ", nodes=" + nodes +
                '}';
    }
}
