package com.huayu.handler;

import com.huayu.entity.Partsrepbill;
import com.huayu.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}
