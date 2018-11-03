package com.sgr.meijia.controller;

import com.sgr.meijia.bean.Result;
import com.sgr.meijia.bean.Title;
import com.sgr.meijia.bean.User;
import com.sgr.meijia.constants.CookieConst;
import com.sgr.meijia.constants.RedisConst;
import com.sgr.meijia.enums.ResultEnum;
import com.sgr.meijia.exception.MyException;
import com.sgr.meijia.service.impl.TitleServiceImp;
import com.sgr.meijia.service.impl.UserServiceImp;
import com.sgr.meijia.utils.CookieUtil;
import com.sgr.meijia.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

@RestController
public class LoginController {

    @Autowired
    private UserServiceImp mUserServiceImp;

    @Autowired
    private RedisTemplate redisTemplate;
    /**
     * 网页后台登录
     * @param user 名字
     * @return 返回插入的title
     */
    @PostMapping(value = "user/login")
    public Result<User> WebLogin( User user, HttpServletResponse response){
        User resutlUser= mUserServiceImp.Login(user);


       if(resutlUser==null){
           throw new MyException(ResultEnum.LOGIN_ERROE);//账号或者密码错误
       }
        // 2.设置token至redis
        String token = UUID.randomUUID().toString();
        redisTemplate.opsForValue()
                .set(String.format(RedisConst.TOKEN_RREFIX, token), resutlUser, RedisConst.EXPIRE, TimeUnit.SECONDS);

        // 3.设置token至cookie  浏览器
        Cookie cookie = CookieUtil.set(response, CookieConst.TOKEN, token, CookieConst.EXPIRE);


        return ResultUtil.success(resutlUser);
    }

    /**
     * api登录
     * @param user 名字
     * @return 返回插入的title
     */
    @PostMapping(value = "user/api/login")
    public Result<User> ApiLogin(@RequestBody User user, HttpServletResponse response){
        User resutlUser= mUserServiceImp.Login(user);
        if(resutlUser==null){
            throw new MyException(ResultEnum.LOGIN_ERROE);//账号或者密码错误
        }
        // 2.设置token至redis
        String token = UUID.randomUUID().toString();
        redisTemplate.opsForValue()
                .set(String.format(RedisConst.TOKEN_RREFIX, token), resutlUser, RedisConst.EXPIRE, TimeUnit.SECONDS);


        return ResultUtil.success(resutlUser);
    }

}
