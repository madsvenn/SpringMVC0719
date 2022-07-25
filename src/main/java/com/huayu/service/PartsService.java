package com.huayu.service;

import com.github.pagehelper.PageHelper;
import com.huayu.entity.Parts;
import com.huayu.entity.PartsExample;
import com.huayu.entity.Partsrepertory;
import com.huayu.entity.PartsrepertoryExample;
import com.huayu.mapper.PartsMapper;
import com.huayu.mapper.PartsrepertoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PartsService {

    @Autowired
    PartsMapper dao;

    @Autowired
    PartsrepertoryMapper mapper;

    public void insert(Parts parts) {
        dao.insert(parts);
    }

    @Deprecated
    public List<Parts> selectAll() {
        PartsExample example = new PartsExample();
        return dao.selectByExample(example);
    }

    public List<Parts> selectByKey(String key) {

        PartsExample example = new PartsExample();
        if (key != null && !key.trim().equals("")) {
            example.createCriteria().andPartsnameLike("%" + key + "%");
        }
        return dao.selectByExample(example);
    }

    public Parts selectById(Integer id) {

        return dao.selectByPrimaryKey(id);
    }

    public void updateByPojo(Parts parts) {
        dao.updateByPrimaryKey(parts);
    }

    public void deleteById(Integer id) {
        dao.deleteByPrimaryKey(id);
    }

    /**
     *
     * @return 库存查询，将name改变
     */

    public List<Partsrepertory> selectRepertory(Integer id){


        PartsrepertoryExample example = new PartsrepertoryExample();

        if(id!=null && !id.equals("") ){
            example.createCriteria().andPartsidEqualTo(id);
        }

        return mapper.selectByExample(example);
    }

}
