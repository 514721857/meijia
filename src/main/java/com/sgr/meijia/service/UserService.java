package com.sgr.meijia.service;

import com.sgr.meijia.bean.Title;
import com.sgr.meijia.bean.User;
import com.sgr.meijia.repository.ITitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

    //注册
    User Regist(User user);

    //更新（修改）
    User UpdateUser(User user);

    //查询
    User getUser(int id);

    //登录
    User Login(User user);

    //封号
    User ForbiddenUser(int id);




}
