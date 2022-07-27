package com.huayu.service;

import com.huayu.entity.Code;
import com.huayu.entity.CodeExample;
import com.huayu.entity.Order;
import com.huayu.entity.OrderExample;
import com.huayu.mapper.CodeMapper;
import com.huayu.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    CodeMapper codeDao;

    @Autowired
    OrderMapper orderDao;

    public List<Order> selectAll(){
        OrderExample example = new OrderExample();

        List<Order> list = orderDao.selectByExample(example);
        CodeExample codeExample = new CodeExample();
        codeExample.createCriteria().andTypeEqualTo("order");
        List<Code> codes = codeDao.selectByExample(codeExample);
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
        CodeExample codeExample = new CodeExample();
        codeExample.createCriteria().andTypeEqualTo("order");
        List<Code> codes = codeDao.selectByExample(codeExample);
        for(Code y:codes){
            if(flag.equals(y.getName())){
                flag = y.getCode();
            }
        }
        System.out.println(flag);
        OrderExample example = new OrderExample();
        example.createCriteria().andOrdercodeLike("%"+code+"%").andOrderdateEqualTo(date).andOrderflagEqualTo(flag);
        List<Order> list = orderDao.selectByExample(example);
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
        return orderDao.selectByPrimaryKey(id);
    }

    
}
