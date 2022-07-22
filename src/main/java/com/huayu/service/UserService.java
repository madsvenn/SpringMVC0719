package com.huayu.service;

import com.huayu.entity.User;
import com.huayu.entity.UserExample;
import com.huayu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper dao;

    public List<User> selectAll(){
        UserExample example = new UserExample();

        return dao.selectByExample(example);
    }

    public User selectUserByPwd(String username,String password){

        return dao.selectUserByPassword(username, password);
    }

}
