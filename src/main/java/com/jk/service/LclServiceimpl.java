package com.jk.service;

import com.jk.dao.LclMapper;
import com.jk.pojo.LclOrderBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LclServiceimpl  implements    LclService{
    @Autowired
    private LclMapper   lclMapper;
    @Resource
    private RedisTemplate redisTemplate;
    @Override
    public HashMap<String, Object> findOrder(Integer page, Integer rows, LclOrderBean lclOrderBean) {
        String key = "map"+page+rows;
        //判断是否有条件查询
        if(lclOrderBean.getCourseInfo()!=null&&!lclOrderBean.getCourseInfo().equals("")){
            //有条件查询直接查数据库
            int total = lclMapper.findOrderTotal(lclOrderBean);
            //查询每页显示的list
            int start = (page-1)*rows;//开始位置
            List<LclOrderBean> list = lclMapper.findOrderPage(start,rows,lclOrderBean);
            HashMap<String, Object> map = new HashMap<>();
            map.put("total", total);
            map.put("rows", list);
            return map;
        }else{
            //没有条件查询的话先查询redis缓存
            Map<String,Object> redisMap= redisTemplate.opsForHash().entries(key);
            //redis中没有的话查询数据库
            if(redisMap!=null&&redisMap.size()>0){
                return (HashMap<String, Object>) redisMap;
            }else{
                //redis中没有的话查询数据库
                int total = lclMapper.findOrderTotal(lclOrderBean);
                //查询每页显示的list
                int start = (page-1)*rows;//开始位置
                List<LclOrderBean> list = lclMapper.findOrderPage(start,rows,lclOrderBean);
                HashMap<String, Object> map = new HashMap<>();
                map.put("total", total);
                map.put("rows", list);
                //把map集合保存到redis中
                redisTemplate.opsForHash().putAll(key,map);
                return map;
            }
        }

    }

    @Override
    public List<LclOrderBean> findCommodity() {
        return lclMapper.findCommodity();
    }

    @Override
    public void updateOrder(LclOrderBean lclOrderBean) {
        lclMapper.updateOrder(lclOrderBean);
    }

    @Override
    public void saveOrder(LclOrderBean lclOrderBean) {
        lclMapper.saveOrder(lclOrderBean);
    }

    @Override
    public LclOrderBean findOrderById(String id) {
        return lclMapper.findOrderById(id);
    }


}
