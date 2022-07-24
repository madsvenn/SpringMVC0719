package com.huayu.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 *
 */
@Controller
public class CommonHandler {


    @RequestMapping("/cmp/{path}")
    public String cmp(@PathVariable("path")String path){
        return path;
    }

    @RequestMapping("/cmp/{path}/{path1}")
    public String cmpSub(@PathVariable("path")String path,
                         @PathVariable("path1")String path1){
        return path +"/"+path1;
    }

    @RequestMapping("/cmp/{path}/{path1}/{path2}")
    public String cmpSub1(@PathVariable("path")String path,
                         @PathVariable("path1")String path1,
                          @PathVariable("path2")String path2){
        return path +"/"+path1+"/"+path2;
    }


    @RequestMapping("/cmp/{path}/{path1}/{path2}/{path3}")
    public String cmpSub2(@PathVariable("path")String path,
                          @PathVariable("path1")String path1,
                          @PathVariable("path2")String path2,
                          @PathVariable("path3")String path3){
        return path +"/"+path1+"/"+path2+"/"+path3;
    }

    @RequestMapping("/cmp/{path}/{path1}/{path2}/{path3}/{path4}")
    public String cmpSub3(@PathVariable("path")String path,
                          @PathVariable("path1")String path1,
                          @PathVariable("path2")String path2,
                          @PathVariable("path3")String path3,
                          @PathVariable("path4")String path4){
        return path +"/"+path1+"/"+path2+"/"+path3+"/"+path4;
    }



}
