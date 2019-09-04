package com.jk.service;

import com.jk.pojo.LclOrderBean;

import java.util.HashMap;
import java.util.List;

public interface LclService {

    HashMap<String, Object> findOrder(Integer page, Integer rows, LclOrderBean lclOrderBean);

    List<LclOrderBean> findCommodity();

    void updateOrder(LclOrderBean lclOrderBean);

    void saveOrder(LclOrderBean lclOrderBean);

    LclOrderBean findOrderById(String id);
}
