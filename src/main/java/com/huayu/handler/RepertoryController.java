package com.huayu.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huayu.entity.Partsrepbill;
import com.huayu.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("bill")
public class RepertoryController {

    @Autowired
    BillService service;

    @Transactional
    @RequestMapping("/insert.do")
    public String insertBill(Partsrepbill partsrepbill,
                             @RequestParam("countFlag") String flag){

        int count = Integer.valueOf(flag);
        service.InsertRepertory(partsrepbill,count);
        return "redirect:/parts/partsRepertory.do";
    }

    @RequestMapping("/billList.do")
    public String BillList(@RequestParam(value = "partsname",defaultValue = "")String partsname,
                           @RequestParam(value = "codename",defaultValue = "")String codename,
                           @RequestParam(value = "typename",defaultValue = "")String typename,
                           @RequestParam(value = "billtime" ,defaultValue = "")String billtime,
                           @RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum,
                           Map<String,Object> map){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = sdf.parse(billtime);
        } catch (ParseException e) {
            System.out.println("转失败");
        }
        System.out.println(date);
        List<Partsrepbill> list = null;
        PageHelper.startPage(pageNum,10);
        if(!billtime.equals("")){
             list = service.select_bill(Partsrepbill.builder()
                    .codename(codename)
                    .partsname(partsname)
                    .typename(typename)
                    .billtime(date)
                    .build());
            map.put("billtime",billtime);
        }else {
            list = service.select_bill(Partsrepbill.builder()
                    .codename(codename)
                    .partsname(partsname)
                    .typename(typename)
                    .build());
        }

        PageInfo<Partsrepbill> pageInfo = new PageInfo<>(list);
        map.put("pageInfo",pageInfo);
        map.put("partsname",partsname);
        map.put("codename",codename);
        map.put("typename",typename);

        return "/static/pages/partssys/partsrepbill/partsrepbilllist";
    }
}
