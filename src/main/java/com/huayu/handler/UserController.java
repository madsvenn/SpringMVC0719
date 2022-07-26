package com.huayu.handler;

import com.huayu.entity.User;
import com.huayu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping( "/user")
@SessionAttributes("user")
public class UserController {

    @Autowired
    UserService service;

    /**
     * 登录功能
     * @param name
     * @param pwd
     * @param map
     * @return
     */
    @RequestMapping( "/login.do")
    public String loginConfirm(@RequestParam(value = "username") String name,
                               @RequestParam(value = "Password") String pwd,
                               Map<String,Object>map){

        User user = service.selectUserByPwd(name, pwd);
        map.put("user",user);
        if(user != null){
            user.setLogintime(new Date());
            service.updateLoginTime(user);
            return "index";
        }
        return "redirect:/login";
    }

}
