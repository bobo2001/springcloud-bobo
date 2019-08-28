package com.jk.service;

import com.jk.dao.LclMapper;
import com.jk.pojo.LclOrderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class LclServiceimpl  implements    LclService{
    @Autowired
    private LclMapper   lclMapper;

    @Override
    public HashMap<String, Object> findOrder(Integer page, Integer rows, LclOrderBean lclOrderBean) {
       /** String str =new SimpleDateFormat("yyMMddHHmmss").format(new Date());
        int i = (int)(Math.random()*900 + 100);
        String myStr = Integer.toString(i);
        lclOrderBean.setOrderNumber(str+myStr);
        */
        //查询总条数
        int total = lclMapper.findOrderTotal(lclOrderBean);
        //查询每页显示的list
        int start = (page-1)*rows;//开始位置
        List<LclOrderBean> list = lclMapper.findOrderPage(start,rows,lclOrderBean);
        HashMap<String, Object> map = new HashMap<>();
        map.put("total", total);
        map.put("rows", list);
        return map;
    }


}
