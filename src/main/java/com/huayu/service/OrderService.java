package com.huayu.service;

import com.huayu.entity.*;
import com.huayu.mapper.CodeMapper;
import com.huayu.mapper.OrderMapper;
import com.huayu.mapper.OrderdetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    CodeMapper codeMapper;

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    PartsService partsService;

    @Autowired
    OrderdetailMapper orderdetailMapper;

    @Autowired
    BillService billService;


    public List<Order> selectAll(){
        OrderExample example = new OrderExample();

        List<Order> list = orderMapper.selectByExample(example);
        CodeExample codeExample = new CodeExample();
        codeExample.createCriteria().andTypeEqualTo("order");
        List<Code> codes = codeMapper.selectByExample(codeExample);
        list.forEach(x->{
            for(Code y:codes){
                if(x.getOrderflag().equals(y.getCode())){
                    x.setOrderflag(y.getName());
                }
            }
        });
        return list;
    }

    public List<Order> selectByParam(String code,
                                     Date date,
                                     String flag){

        OrderExample example = new OrderExample();
        OrderExample.Criteria criteria = example.createCriteria();
        //先查询code flag
        CodeExample codeExample = new CodeExample();
        codeExample.createCriteria().andTypeEqualTo("order");

        if (code != null && !code.trim().equals("")){

            criteria.andOrdercodeLike("%"+code+"%");
        }
        //
        if (date != null && !date.equals("")){
            criteria.andOrderdateEqualTo(date);
        }

        if (flag != null && !flag.trim().equals("")){
            criteria.andOrderflagEqualTo(flag);
        }

        List<Order> list = orderMapper.selectByExample(example);

        List<Code> codes = codeMapper.selectByExample(codeExample);
        for(Code y:codes){
            if(flag.equals(y.getName())){
                flag = y.getCode();
            }
        }
        System.out.println(flag);
        list.forEach(x->{
            for(Code y:codes){
                if(x.getOrderflag().equals(y.getCode())){
                    x.setOrderflag(y.getName());
                }
            }
        });
        return list;
    }

    public Order selectById(Integer id){
        return orderMapper.selectByPrimaryKey(id);
    }


    /**
     * 生成订单
     * @param order
     * @param user
     */
    @Transactional
    public void insertOrder(Order order, User user){

        orderMapper.insert(order);
        Date date = new Date();
        order.setOrderdate(date);
        System.out.println(order.getOrderid());
        int i = 0;
        while (i < order.getPartsid().length){

            //将所有的part插入到orderdetail里面
            Orderdetail orderdetail = new Orderdetail();
            orderdetail.setOrderid(order.getOrderid());
            orderdetail.setOrderpartscount(order.getOrderpartscount()[i]);
            orderdetail.setPartsid(order.getPartsid()[i]);
            orderdetailMapper.insert(orderdetail);

            i++;
        }

        if (order.getOrderflag() != null && order.getOrderflag().equals("2")){

            i = 0;
            while (i < order.getPartsid().length){

                //将订单的数据插入到bill中
                Partsrepbill partsrepbill = new Partsrepbill();
                partsrepbill.setBillflag("out");
                partsrepbill.setBilltype("out1");
                partsrepbill.setPartsid(order.getPartsid()[i]);
                partsrepbill.setBillcount(order.getOrderpartscount()[i]);
                partsrepbill.setBilltime(order.getOrderdate());
                partsrepbill.setBilluser(user.getUserid());

                //获取库存count并且，插入到bill中，并且更改库存量
                billService.InsertRepertory(partsrepbill,partsService.selectByPartsId(order.getPartsid()[i]).get(0).getPartsreqcount());
                i++;
            }
        }

    }

    public void orderDelete(Integer orderid){
        orderMapper.deleteByPrimaryKey(orderid);
    }

    public Order selectOrderDetailld(Integer orderid){
        OrderdetailExample example = new OrderdetailExample();
        example.createCriteria().andOrderidEqualTo(orderid);
        List<Orderdetail> list = orderdetailMapper.selectByExample(example);
        List<Integer> partsid = null;
        List<Integer> orderpartscount = null;
        list.forEach(x->{
            partsid.add(x.getPartsid());
            orderpartscount.add(x.getOrderpartscount());
        });

        return Order.builder().partsid(partsid.toArray(new Integer[partsid.size()]))
                .orderpartscount(orderpartscount.toArray(new Integer[orderpartscount.size()]))
                .build();
    }

}
