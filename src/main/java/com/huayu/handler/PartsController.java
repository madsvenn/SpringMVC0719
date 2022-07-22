package com.huayu.handler;

import com.huayu.entity.Parts;
import com.huayu.service.PartsService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/parts")
@SessionAttributes("list")
public class PartsController {

    @Autowired
    PartsService service;

    /**
     * 添加物件使用了pojo来入参
     * @param parts
     * @return
     */

    @Transactional
    @RequestMapping("/partsAdd.do")
    public String addParts(Parts parts) {
        System.out.println(parts);
        service.insert(parts);
        return "/static/pages/partssys/parts/partslist";
    }

    /**
     * 物件列表
     * @param map
     * @return
     */

    @RequestMapping("/partsList.do")
    public String PartsList(Map<String,Object>map){
        List<Parts> list = service.selectAll();
        map.put("list",list);
        return "/static/pages/partssys/parts/partslist";
    }

    /**
     * 物件查询功能
     * @param key
     * @param map
     * @return
     */

    @RequestMapping("/partsSearch.do")
    public String partsSearch(@RequestParam("textfield2")String key,
                              Map<String,Object> map){
        List<Parts> list = service.selectByKey(key);
        map.put("list",list);
        System.out.println(1);
        System.out.println(key);
        return "/static/pages/partssys/parts/partslist";
    }
}
