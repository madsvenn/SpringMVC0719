package com.huayu.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huayu.Vo.Message;
import com.huayu.entity.Order;
import com.huayu.entity.User;
import com.huayu.service.OrderService;
import com.huayu.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;


import java.util.*;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    PartsService partsService;

    @Deprecated
    @RequestMapping("/list.do")
    public String orderList(Map<String ,Object>map){
        List<Order> list = orderService.selectAll();
        map.put("list",list);
        return "/static/pages/ordersys/order/orderlist";
    }

    @RequestMapping("/searcher.do")
    public String orderSearcher(@RequestParam(value = "textfield",defaultValue = "")String code,
                                @RequestParam(value = "textfield2",defaultValue = "") Date date,
                                @RequestParam(value = "datepiker2",defaultValue = "") String flag,
                                @RequestParam(value = "pageNum" ,defaultValue = "1")Integer pageNum,
                                Map<String,Object>map){

        PageHelper.startPage(pageNum,10);
        List<Order> list = orderService.selectByParam(code, date, flag);
        PageInfo<Order> pageInfo = new PageInfo<>(list);
        map.put("textfield",code);
        map.put("textfield2",date);
        map.put("datepiker2",flag);
        map.put("list",list);
        map.put("pageInfo",pageInfo);
        return "/static/pages/ordersys/order/orderlist";
    }

    @RequestMapping("/edit.do")
    public String OrderEdit(@RequestParam("orderid")Integer id,
                            Map<String,Object>map){
        Order order = orderService.selectById(id);
        map.put("order",order);
        System.out.println(order);
        return "/static/pages/ordersys/order/orderedit";
    }

    @RequestMapping("/selectParts.do")
    public String selectParts(@RequestParam(value = "pageNum",defaultValue = "1")Integer pageNum,
                              @RequestParam(value = "partsName",required = false) String partsName,
                              Map<String,Object> map){

        PageHelper.startPage(pageNum,5);
        List<Map<String,Object>> list = partsService.selectRepertoryName(partsName,null);
        PageInfo<Map<String,Object>> pageInfo = new PageInfo<>(list);
        map.put("pageInfo",pageInfo);
        map.put("action","static/pages/ordersys/order/getParts");
        Map<String,String> param = new HashMap<>();
        param.put("partsName",partsName);
        map.put("param",param);

        return "static/pages/ordersys/order/getParts";
    }


    @RequestMapping("/save.do")
    @ResponseBody
    public Message savePost(@SessionAttribute("user")User user,
                            Order order){
        System.out.println(Arrays.toString(order.getPartsid()));
        System.out.println(Arrays.toString(order.getOrderpartscount()));

        try {
            orderService.insertOrder(order,user);
            return new Message(200,"GOOD");
        }catch (Exception e){
            return new Message(500,"库存不足");
        }

    }

    @RequestMapping("/delete.do")
    public String OrderDelete(@RequestParam("orderid")Integer orderid,
                              @RequestParam("pageNum")Integer pageNum,
                              Map<String,Object> map){
        orderService.orderDelete(orderid);
        map.put("pageNum",pageNum);
        return "forward:/order/searcher.do";
    }
}
