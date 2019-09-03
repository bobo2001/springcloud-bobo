package com.jk.controller;

import com.jk.pojo.LclOrderBean;
import com.jk.service.LclService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.Region;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.HashMap;
import java.util.List;
@Controller
@RequestMapping("order")
public class LclController {
    @Autowired
    private LclService       lclService;
    @RequestMapping("findOrder")
    @ResponseBody

    public HashMap<String, Object> findOrder(LclOrderBean lclOrderBean, Integer  page, Integer rows){

        return  lclService.findOrder(page,rows,lclOrderBean);
    }

    @RequestMapping("downloadAllClassmate")
    @ResponseBody
    public void downloadAllClassmate(HttpServletResponse response, LclOrderBean lclOrderBean) throws Exception {
        List<LclOrderBean> commodity = lclService.findCommodity();

        HSSFWorkbook wb = new HSSFWorkbook();//创建一个excel文件
        HSSFSheet sheet = wb.createSheet("商品信息");//创建一个工作薄
        sheet.setColumnWidth((short) 3, 20 * 256);    //---》设置单元格宽度，因为一个单元格宽度定了那么下面多有的单元格高度都确定了所以这个方法是sheet的
        sheet.setColumnWidth((short) 4, 20 * 256);    //--->第一个参数是指哪个单元格，第二个参数是单元格的宽度
        sheet.setDefaultRowHeight((short) 300);    // ---->有得时候你想设置统一单元格的高度，就用这个方法
        HSSFDataFormat format = wb.createDataFormat();   //--->单元格内容格式
        HSSFRow row1 = sheet.createRow(0);   //--->创建一行
        // 四个参数分别是：起始行，起始列，结束行，结束列 (单个单元格)
        sheet.addMergedRegion(new Region(0, (short) 0, 0, (short) 5));//可以有合并的作用
        HSSFCell cell1 = row1.createCell((short) 0);   //--->创建一个单元格
        cell1.setCellValue("商品信息总览");
        sheet.addMergedRegion(new Region(1, (short) 0, 1, (short) 0));
        HSSFRow row2 = sheet.createRow(1);   ////创建第二列 标题
        HSSFCell fen = row2.createCell((short) 0);   //--->创建一个单元格
        fen.setCellValue("主键");
        HSSFCell no = row2.createCell((short) 1);   //--->创建一个单元格
        no.setCellValue("订单号");
        HSSFCell age = row2.createCell((short) 2);   //--->创建一个单元格
        age.setCellValue("课程信息");
        HSSFCell grage = row2.createCell((short) 3);   //--->创建一个单元格
        grage.setCellValue("讲师信息");
        HSSFCell grageq = row2.createCell((short) 4);   //--->创建一个单元格
        grageq.setCellValue("用户信息");
        HSSFCell gragew = row2.createCell((short) 5);   //--->创建一个单元格
        gragew.setCellValue("交易类型");
        HSSFCell gragee = row2.createCell((short) 6);   //--->创建一个单元格
        gragee.setCellValue("支付方式");
        HSSFCell grager = row2.createCell((short) 7);   //--->创建一个单元格
        grager.setCellValue("支付金额");
        HSSFCell gragert = row2.createCell((short) 8);   //--->创建一个单元格
        gragert.setCellValue("购买渠道");
        HSSFCell gragery = row2.createCell((short) 9);   //--->创建一个单元格
        gragery.setCellValue("订单状态");
        HSSFCell grageru = row2.createCell((short) 10);   //--->创建一个单元格
        grageru.setCellValue("客户备注");
        HSSFCell grageri = row2.createCell((short) 11);   //--->创建一个单元格
        grageri.setCellValue("支付时间");

        for (int i = 0; i < commodity.size(); i++) {
            sheet.addMergedRegion(new Region(1 + i + 1, (short) 0, 1 + i + 1, (short) 0));
            HSSFRow rows = sheet.createRow(1 + i + 1);   ////创建第二列 标题
            HSSFCell fens = rows.createCell((short) 0);   //--->创建一个单元格
            fens.setCellValue(commodity.get(i).getId());
            HSSFCell nos = rows.createCell((short) 1);   //--->创建一个单元格
            nos.setCellValue(commodity.get(i).getOrderNumber());
            HSSFCell ages = rows.createCell((short) 2);   //--->创建一个单元格
            ages.setCellValue(commodity.get(i).getCourseInfo());
            HSSFCell grages = rows.createCell((short) 3);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getUserInfo());
            HSSFCell gragesa = rows.createCell((short) 4);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getDealType());
            HSSFCell gragess = rows.createCell((short) 5);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getPayType());
            HSSFCell gragesd = rows.createCell((short) 6);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getOrderPrice());
            HSSFCell gragesf = rows.createCell((short) 7);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getBuyType());
            HSSFCell gragesg = rows.createCell((short) 8);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getOrderStatus());
            HSSFCell gragesh = rows.createCell((short) 9);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getPeopleRemarks());
            HSSFCell gragesj = rows.createCell((short) 10);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getPayTime());
            HSSFCell gragesk = rows.createCell((short) 11);   //--->创建一个单元格
            grages.setCellValue(commodity.get(i).getTeacherInfo());

        }
        FileOutputStream fileOut = null;
        try {
            fileOut = new FileOutputStream("E:\\dingdan2.xls");
            wb.write(fileOut);
            //fileOut.close();
            System.out.print("OK");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileOut != null) {
                try {
                    fileOut.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }}







