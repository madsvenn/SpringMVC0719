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
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PartsService {

    @Autowired
    PartsMapper partsMapper;

    @Autowired
    PartsrepertoryMapper partsrepertoryMapper;

    public void insert(Parts parts) {
        partsMapper.insert(parts);
    }

    @Deprecated
    public List<Parts> selectAll() {
        PartsExample example = new PartsExample();
        return partsMapper.selectByExample(example);
    }

    public List<Parts> selectByKey(String key) {

        PartsExample example = new PartsExample();
        if (key != null && !key.trim().equals("")) {
            example.createCriteria().andPartsnameLike("%" + key + "%");
        }
        return partsMapper.selectByExample(example);
    }

    public Parts selectById(Integer id) {

        return partsMapper.selectByPrimaryKey(id);
    }

    public void updateByPojo(Parts parts) {
        partsMapper.updateByPrimaryKey(parts);
    }

    public void deleteById(Integer id) {
        partsMapper.deleteByPrimaryKey(id);
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

        return partsrepertoryMapper.selectByExample(example);
    }

    public List<Map<String,Object>> selectRepertoryName(String partsName,Integer partsid){

        PartsrepertoryExample example = new PartsrepertoryExample();
        PartsrepertoryExample.Criteria c=example.createCriteria();
        if (partsName != null && !partsName.trim().equals("")){
            c.andPartsNameLike("%"+partsName+"%");
        }
        if (partsid != null && !partsid.equals("")){
            c.andPartsidEqualTo(partsid);
        }
        return partsrepertoryMapper.selectRepertoryByExamole(example);
    }

}
