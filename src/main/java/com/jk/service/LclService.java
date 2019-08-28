package com.jk.service;

import com.jk.pojo.LclOrderBean;

import java.util.HashMap;

public interface LclService {

    HashMap<String, Object> findOrder(Integer page, Integer rows, LclOrderBean lclOrderBean);
}
