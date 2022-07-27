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


import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    OrderService orderService;

    @Autowired
    PartsService partsService;

    @RequestMapping("/list.do")
    public String orderList(Map<String ,Object>map){
        List<Order> list = orderService.selectAll();
        map.put("list",list);
        return "/static/pages/ordersys/order/orderlist";
    }

    @RequestMapping("/searcher.do")
    public String orderSearcher(@RequestParam("textfield")String code,
                                @RequestParam("textfield2") Date date,
                                @RequestParam("datepiker2") String flag,
                                Map<String,Object>map){

        List<Order> list = orderService.selectByParam(code, date, flag);
        map.put("textfield",code);
        map.put("textfield2",date);
        map.put("datepiker2",flag);
        map.put("list",list);
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

    @Transactional
    @RequestMapping("/save")
    @ResponseBody
    public Message savePost(@SessionAttribute("user")User user,
                            Order order){
        System.out.println(order.getPartsid());
        System.out.println(order.getOrderpartscount());

        return new Message(200,"GOOD");
    }
}
