package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.ZhuanQuService;
import com.jk.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("zhuanqu")
public class ZhuanQuController {
    @Autowired
    private ZhuanQuService zhuanQuService;



    //跳转专区页面
    @RequestMapping("ToZhuanQuShowList")
    public String ToZhuanQuShowList(){
        return "ZhuanQuShowList";
    }
    //查询专区
    @RequestMapping("findZhuanQuList")
    @ResponseBody
    public List<ZhuanQuBean> findZhuanQuList(){
        return zhuanQuService.findZhuanQuList();
    }

    //跳转专区新增
    @RequestMapping("toAddZhuanQu")
    public String toAddZhuanQu(){
        return "AddZhuanQu";
    }
    //专区新增 saveZhuanQu
    @RequestMapping("saveZhuanQu")
    @ResponseBody
    public  Boolean saveZhuanQu(ZhuanQuBean zhuanQuBean){
        try {
            if(zhuanQuBean.getId() != null){
                zhuanQuService.updateZhuanQu(zhuanQuBean);
            }else{
                zhuanQuService.saveZhuanQu(zhuanQuBean);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    //专区回显 EditZhuanQuById
    @RequestMapping("EditZhuanQuById")
    @ResponseBody
    public ZhuanQuBean  EditZhuanQuById(String  id){
        return zhuanQuService.EditZhuanQuById(id);
    }
    //专区删除    delZhuanQuByIds
    @RequestMapping("delZhuanQuByIds")
    @ResponseBody
    public Boolean delZhuanQuByIds(Integer[] ids){
        try {
            zhuanQuService.delZhuanQuByIds(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //查询头部导航
    @RequestMapping("findTouBuList")
    @ResponseBody
    public List<TouBuBean> findTouBuList(){
        return zhuanQuService.findTouBuList();
    }
    @RequestMapping("ToTouBuhowList")
    public String ToTouBuhowList(){
        return "TouBuhowList";
    }
    //头部删除    delTouBuByIds
    @RequestMapping("delTouBuByIds")
    @ResponseBody
    public Boolean delTouBuByIds(Integer[] ids){
        try {
            zhuanQuService.delTouBuByIds(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    //跳转头部新增
    @RequestMapping("toAddTouBu")
    public String toAddTouBu(){
        return "AddTouBu";
    }
    //头部新增 saveDiBu
    @RequestMapping("saveTouBu")
    @ResponseBody
    public  Boolean saveTouBu(TouBuBean touBuBean){
        try {
            if(touBuBean.getId() != null){
                zhuanQuService.updateTouBu(touBuBean);
            }else{
                zhuanQuService.saveTouBu(touBuBean);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    //头部回显 EditTouBuById
    @RequestMapping("EditTouBuById")
    @ResponseBody
    public TouBuBean  EditTouBuById(String  id){
        return zhuanQuService.EditTouBuById(id);
    }



    //跳转首页页面
    @RequestMapping("ToShouYeShowList")
    public String ToShouYeShowList(){
        return "ShouYeShowList";
    }
    //查询首页
    @RequestMapping("findShouYeList")
    @ResponseBody
    public List<ShouYeBean> findShouYeList(){
        return zhuanQuService.findShouYeList();
    }
    @RequestMapping("upload")
    @ResponseBody
    public String 	upload(MultipartFile img , HttpServletRequest request){
        String fileUpload = FileUtil.FileUpload(img, request);
        return fileUpload;
    }
    //跳转首页新增
    @RequestMapping("toAddShouye")
    public String toAddShouye(){
        return "AddShouye";
    }
    //首页新增 saveShouYe
    @RequestMapping("saveShouYe")
    @ResponseBody
    public  Boolean saveShouYe(ShouYeBean shouYeBean){
        try {
            zhuanQuService.saveShouYe(shouYeBean);
            return true;
        }catch (Exception e){
            return false;
        }
    }




    //跳转底部页面
    @RequestMapping("ToDiBuShowList")
    public String ToDiBuShowList(){
        return "DiBuShowList";
    }
   //查询底部
    @RequestMapping("findDiBuList")
    @ResponseBody
    public List<DiBuBean> findDiBuList(){
        return zhuanQuService.findDiBuList();
    }

    //跳转底部新增
    @RequestMapping("toAddDiBu")
    public String toAddDiBu(){
        return "AddDiBu";
    }
    //底部新增 saveDiBu
    @RequestMapping("saveDiBu")
    @ResponseBody
    public  Boolean saveDiBu(DiBuBean diBuBean){
        try {
            if(diBuBean.getId() != null){
                zhuanQuService.updateDiBu(diBuBean);
            }else{
                zhuanQuService.saveDiBu(diBuBean);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    //底部回显 EditDiBuById
    @RequestMapping("EditDiBuById")
    @ResponseBody
    public DiBuBean  EditDiBuById(String  id){
        return zhuanQuService.EditDiBuById(id);
    }
    //底部删除    delDiBuByIds
    @RequestMapping("delDiBuByIds")
    @ResponseBody
    public Boolean delDiBuByIds(Integer[] ids){
        try {
            zhuanQuService.delDiBuByIds(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }



    //跳转链接页面
    @RequestMapping("ToLianJieShowList")
    public String ToLianJieShowList(){
        return "LJShowList";
    }
    //查询链接
    @RequestMapping("findLianJieList")
    @ResponseBody
    public List<LianJieBean> findLianJieList(){
        List<LianJieBean> list = zhuanQuService.findLianJieList();
        List<LianJieBean> list1 = new ArrayList<LianJieBean>();
        for (int i =0 ;i<list.size();i++){
            LianJieBean lianJieBean = list.get(i);
            lianJieBean.setNameurl(lianJieBean.getName()+lianJieBean.getUrl());
            list1.add(lianJieBean);
        }
        return list1;
    }

    //跳转链接新增
    @RequestMapping("toAddLianJie")
    public String toAddLianJie(){
        return "AddLianJie";
    }
    //链接新增 saveLianJie
    @RequestMapping("saveLianJie")
    @ResponseBody
    public  Boolean saveLianJie(LianJieBean lianJieBean){
        try {
            if(lianJieBean.getId() != null){
                zhuanQuService.updateLianJie(lianJieBean);
            }else{
                zhuanQuService.saveLianJieshow(lianJieBean);
            }
            return true;
        }catch (Exception e){
            return false;
        }
    }
    //链接回显 EditLianJieById
    @RequestMapping("EditLianJieById")
    @ResponseBody
    public LianJieBean  EditLianJieById(String  id){
        return zhuanQuService.EditLianJieById(id);
    }
    //链接删除    delLianJieByIds
    @RequestMapping("delLianJieByIds")
    @ResponseBody
    public Boolean delLianJieByIds(Integer[] ids){
        try {
            zhuanQuService.delLianJieByIds(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    //跳转推荐页面
    @RequestMapping("ToTuiJianShowList")
    public String ToTuiJianShowList(){
        return "TuiJianShowList";
    }
    //查询推荐
    @RequestMapping("findTuiJianList")
    @ResponseBody
    public List<TuiJianBean> findTuiJianList(){
        return zhuanQuService.findTuiJianList();
    }
}
