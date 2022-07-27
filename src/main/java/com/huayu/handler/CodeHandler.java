package com.huayu.handler;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.huayu.entity.Code;
import com.huayu.entity.Parts;
import com.huayu.entity.PartsExample;
import com.huayu.entity.Partsrepertory;
import com.huayu.mapper.PartsMapper;
import com.huayu.service.CodeService;
import com.huayu.service.PartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/code")
public class CodeHandler {

    @Autowired
    CodeService service;

    @Autowired
    PartsService Pservice;

    @Autowired
    PartsMapper dao;

    @RequestMapping("/getCode.do")
    @ResponseBody
    public List<Code> CodeSelect(@RequestParam("code") String code){

        List<Code> list = service.selectByCode(code);
        return list;
    }

    @RequestMapping("/gainParts.do")
    @ResponseBody
    public List<Partsrepertory> GainParts(){

        List<Partsrepertory> list = Pservice.selectRepertory(null);
        PartsExample example = new PartsExample();
        List<Parts> parts = dao.selectByExample(example);

        return list.stream().map(x->{
            for(Parts y:parts){
                if (x.getPartsid()==y.getPartsid()){
                    x.setPartsname(y.getPartsname());
                }
            }return x;
        }).collect(Collectors.toList());
    }

    @RequestMapping("/getCodeByName.do")
    @ResponseBody
    public List<Code> getCodeByName(@RequestParam("codename") String name){
        List<Code> list = service.selectByName(name);
        return list.stream().filter(x->x.getName().length()>2).collect(Collectors.toList());
    }
}
