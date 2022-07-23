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

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
}
