package com.huayu.handler;

import com.huayu.entity.Order;
import com.huayu.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService dao;

    @RequestMapping("/list.do")
    public String orderList(Map<String ,Object>map){
        List<Order> list = dao.selectAll();
        map.put("list",list);
        return "/static/pages/ordersys/order/orderlist";
    }

    @RequestMapping("/searcher.do")
    public String orderSearcher(@RequestParam("textfield")String code,
                                @RequestParam("textfield2") Date date,
                                @RequestParam("datepiker2") String flag,
                                Map<String,Object>map){

        List<Order> list = dao.selectByParam(code, date, flag);
        map.put("textfield",code);
        map.put("textfield2",date);
        map.put("datepiker2",flag);
        map.put("list",list);
        return "/static/pages/ordersys/order/orderlist";
    }

    @RequestMapping("/edit.do")
    public String OrderEdit(@RequestParam("orderid")Integer id,
                            Map<String,Object>map){
        Order order = dao.selectById(id);
        map.put("order",order);
        System.out.println(order);
        return "/static/pages/ordersys/order/orderedit";
    }
}
