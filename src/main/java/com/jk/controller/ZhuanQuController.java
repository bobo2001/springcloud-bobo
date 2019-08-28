package com.jk.controller;

import com.jk.pojo.ShouYeBean;
import com.jk.pojo.TouBuBean;
import com.jk.pojo.ZhuanQuBean;
import com.jk.service.ZhuanQuService;
import com.jk.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("zhuanqu")
public class ZhuanQuController {
    @Autowired
    private ZhuanQuService zhuanQuService;
    //查询专区
    @RequestMapping("findZhuanQuList")
    @ResponseBody
    public List<ZhuanQuBean> findZhuanQuList(){
        return zhuanQuService.findZhuanQuList();
    }
    @RequestMapping("ToZhuanQuShowList")
    public String ToZhuanQuShowList(){
        return "ZhuanQuShowList";
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
    //专区删除    delTouBuByIds
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
    //跳转
    @RequestMapping("ToShouYeShowList")
    public String ToShouYeShowList(){
        return "ShouYeShowList";
    }
   /* //查询专区
    @RequestMapping("findZhuanQuList")
    @ResponseBody
    public List<ZhuanQuBean> findZhuanQuList(){
        return zhuanQuService.findZhuanQuList();
    }
    @RequestMapping("ToZhuanQuShowList")
    public String ToZhuanQuShowList(){
        return "ZhuanQuShowList";
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
    }*/
}
