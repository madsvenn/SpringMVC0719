package com.huayu.handler;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.huayu.entity.Parts;
import com.huayu.entity.PartsExample;
import com.huayu.entity.Partsrepertory;
import com.huayu.mapper.PartsMapper;
import com.huayu.service.PartsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/parts")
@SessionAttributes("list")
public class PartsController {

    @Autowired
    PartsService service;

    @Autowired
    PartsMapper dao;
    /**
     * 添加物件使用了pojo来入参
     * @param
     * @return
     */

    @RequestMapping("/partsAdd.do")
    public String addParts(HttpServletRequest request,Map<String,Object>map,Parts parts) {

//        Parts parts = new Parts();
//        SimpleDateFormat sfg = new SimpleDateFormat("yyyy-MM-dd");
//        parts.setPartsname((String) request.getParameter("partsname"));
//        parts.setPartsmodel((String) request.getParameter("partsmodel"));
//        parts.setPartsloc((String) request.getParameter("partsloc"));
//        try {
//            parts.setPartsprodate(sfg.parse(request.getParameter("partsprodate")));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        parts.setPartsremark((String) request.getParameter("partsremark"));

        if (parts.getPartsname() == ""){
            System.out.println(parts);
            throw new RuntimeException("不能加入空值");
        }


        service.insert(parts);
        map.put("parts",parts);
        System.out.println(parts);
        return "redirect:/parts/partsList.do";
    }

    /**
     * 物件列表
     * @param map
     * @return
     */

    @RequestMapping("/partsList.do")
    public String PartsList(@RequestParam(value = "textfield2",defaultValue = "")String key,
                            @RequestParam(value = "pageNum" ,defaultValue = "1")Integer pageNum,
                            Map<String,Object> map){

        PageHelper.startPage(pageNum,10);
        System.out.println(key);
        List<Parts> list = service.selectByKey(key);
        PageInfo<Parts> pageInfo = new PageInfo<>(list);
        map.put("pageInfo",pageInfo);
        map.put("textfield2",key);
        return "/static/pages/partssys/parts/partslist";
    }

    /**
     * 冗余，不用
     * 物件查询功能
     * @param key
     * @param map
     * @return
     */

    @Deprecated
    @RequestMapping("/partsSearch.do")
    public String partsSearch(@RequestParam("textfield2")String key,
                              Map<String,Object> map){
        List<Parts> list = service.selectByKey(key);
        map.put("list",list);
        map.put("textfield2",key);
        System.out.println(1);
        System.out.println(key);
        return "/static/pages/partssys/parts/partslist";
    }



    @RequestMapping("/partsEdit.do")
    public String partsView(@RequestParam("partsid")Integer id,
                            Map<String,Object>map){
        Parts parts = service.selectById(id);
        map.put("parts",parts);
        return "/static/pages/partssys/parts/partsedit";
    }


    @RequestMapping("/partsUpdate.do")
    public String partsUpdate(HttpServletRequest request,Parts parts){
//        Parts parts = new Parts();
//        SimpleDateFormat sfg = new SimpleDateFormat("yyyy-MM-dd");
//        parts.setPartsid(Integer.valueOf(request.getParameter("partsid")) );
//        parts.setPartsname((String) request.getParameter("partsname"));
//        parts.setPartsmodel((String) request.getParameter("partsmodel"));
//        parts.setPartsloc((String) request.getParameter("partsloc"));
//        try {
//            parts.setPartsprodate(sfg.parse(request.getParameter("partsprodate")));
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        parts.setPartsremark((String) request.getParameter("partsremark"));

        if (parts.getPartsname() == ""){
            System.out.println(parts);
            throw new RuntimeException("不能加入空值");
        }

        System.out.println(parts);
        service.updateByPojo(parts);
        return "redirect:/parts/partsList.do";
    }

    @Transactional
    @RequestMapping("/partsDelete.do")
    public String partsDelete(@RequestParam("partsid")Integer id){
        service.deleteById(id);
        return "redirect:/parts/partsList.do";
    }

    @RequestMapping("/partsRepertory.do")
    public String repertoryList(@RequestParam(value = "textfield1",defaultValue = "")Integer id,
                                @RequestParam(value = "textfield2",defaultValue = "")String name,
                                @RequestParam(value = "pageNum",defaultValue = "1")Integer num,
                                Map<String,Object> map){

        PageHelper.startPage(num,10);
        List<Partsrepertory> list = service.selectRepertory(id);
        PageInfo<Partsrepertory> pageInfo = new PageInfo<>(list);

        PartsExample example = new PartsExample();
        if(!name.equals("") && name!=null){
            example.createCriteria().andPartsnameLike("%"+name+"%");
        }
        List<Parts> parts = dao.selectByExample(example);

        /**
         * 使用流替换parts中的name
         */
        pageInfo.setList(list.stream().map(x->{
            for(Parts y:parts){
                if (x.getPartsid()==y.getPartsid()){
                    x.setPartsname(y.getPartsname());
                }
            }return x;
        }).filter(x-> x.getPartsname()!=null && !x.getPartsname().equals("")).collect(Collectors.toList()));


        map.put("pageInfo",pageInfo);
        map.put("textfield1",id);
        map.put("textfield2",name);
        return "/static/pages/partssys/partsrep/partsreplist";
    }
}
