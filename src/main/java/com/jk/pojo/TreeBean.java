package com.jk.pojo;

import lombok.Data;

import java.util.List;

@Data
public class TreeBean {

    private Integer id;

    private String text;

    private String href;

    private Integer pid=0;

    private Integer typeId;

    private String uri;

    private Boolean leaf;

    private Boolean selectable;

    private List<TreeBean> nodes;

}
