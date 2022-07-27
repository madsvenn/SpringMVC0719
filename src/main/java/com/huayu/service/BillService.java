package com.huayu.service;

import com.huayu.entity.Partsrepbill;
import com.huayu.entity.PartsrepbillExample;
import com.huayu.entity.Partsrepertory;
import com.huayu.entity.PartsrepertoryExample;
import com.huayu.mapper.PartsMapper;
import com.huayu.mapper.PartsrepbillMapper;
import com.huayu.mapper.PartsrepertoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillService {

    @Autowired
    PartsrepbillMapper dao;

    @Autowired
    PartsrepertoryMapper mapper;

    public void InsertRepertory(Partsrepbill partsrepbill,int count){
        dao.insert(partsrepbill);
        PartsrepertoryExample example = new PartsrepertoryExample();
        example.createCriteria().andPartsidEqualTo(partsrepbill.getPartsid());
        List<Partsrepertory> p = mapper.selectByExample(example);
        if(partsrepbill.getBillflag().equals("out")){
            if(count<partsrepbill.getBillcount())
                throw new RuntimeException("库存不足，出库失败");
            p.get(0).setPartsreqcount(count-partsrepbill.getBillcount());
        }else if (partsrepbill.getBillflag().equals("in")){
            p.get(0).setPartsreqcount(count+partsrepbill.getBillcount());
        }
        mapper.updateByPrimaryKey(p.get(0));
    }

    public List<Partsrepbill> select_bill(Partsrepbill partsrepbill){
        return dao.selectBypartsname(partsrepbill);
    }


}
