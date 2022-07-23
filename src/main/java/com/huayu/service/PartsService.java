package com.huayu.service;

import com.huayu.entity.Parts;
import com.huayu.entity.PartsExample;
import com.huayu.mapper.PartsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PartsService {

    @Autowired
    PartsMapper dao;

    public void insert(Parts parts){
        dao.insert(parts);
    }

    public List<Parts> selectAll(){
        PartsExample example = new PartsExample();
        return dao.selectByExample(example);
    }

    public List<Parts> selectByKey(String key){
        PartsExample example = new PartsExample();
        example.createCriteria().andPartsnameLike("%"+key+"%");
        return dao.selectByExample(example);
    }

    public Parts selectById(Integer id){

        return dao.selectByPrimaryKey(id);
    }

    public void updateByPojo(Parts parts){
        dao.updateByPrimaryKey(parts);
    }

    public void deleteById(Integer id){
        dao.deleteByPrimaryKey(id);
    }
}
