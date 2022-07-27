package com.huayu.service;

import com.huayu.entity.Code;
import com.huayu.entity.CodeExample;
import com.huayu.mapper.CodeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeService {
    @Autowired
    CodeMapper dao;

    public List<Code> selectByCode(String code){
        CodeExample example = new CodeExample();
        example.createCriteria().andTypeEqualTo(code);
        return dao.selectByExample(example);
    }

    public List<Code> selectByName(String name){
        CodeExample example = new CodeExample();
        example.createCriteria().andNameLike("%"+name+"%");
        return dao.selectByExample(example);
    }

}
