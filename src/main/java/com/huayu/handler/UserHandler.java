package com.huayu.handler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.support.BindingAwareModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(value = "admin")
@SessionAttributes(value = {"username","password"})
//@RequestMapping(value = "")
public class UserHandler {


    @RequestMapping(value = "/first.do",method = RequestMethod.POST)
    public String first(Map<String,Object>map,
                        @RequestParam(value = "name")String name){
        System.out.println("first");
        System.out.println(name);
        map.put("name","魔理沙");
        return "success";
    }

    @RequestMapping(value = "/second.do")
    public String second(Map<String,Object> map){
        System.out.println("first");
        map.put("name","魔理沙");
        System.out.println(map.getClass().getSimpleName());;
        return "success";
    }

//    @RequestMapping(value = "")
//    public String index(){
//        return "login";
//    }

    @RequestMapping("/add.do")
    public ModelAndView add(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("name","morisa");
        mv.addObject("hibiki");
        Map<String,Object> map = new HashMap<>();
        map.put("age",12);
        map.put("sex","female");

        mv.addAllObjects(map);
        mv.setViewName("model");

        System.out.println(mv);
        return mv;
    }

    @RequestMapping("/add.action")
    public String addAction(Model model){
        model.addAttribute("name","YoshiKo");
        ModelMap map = new ModelMap();
        return "success";
    }

    @RequestMapping("/add.ctr")
    public String addController(ModelMap map){
        map.addAttribute("name","miku");
        BindingAwareModelMap map1 = new BindingAwareModelMap();
        return "success";
    }


    @RequestMapping("/login.do")
    public String login(@RequestParam("username")String username,
                        @RequestParam("password")String password,
                        Map<String,Object>map){
        map.put("username",username);
        map.put("password",password);
        System.out.println();
        return "success";
    }

    @RequestMapping("/session.do")
    public String getSession(@SessionAttribute("username") String username,
                             @SessionAttribute("password") String password){

        System.out.println("获得的session未"+username+" and "+password);
        return "success";
    }

}
