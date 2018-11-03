package com.sgr.meijia.aspect;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sgr.meijia.bean.User;
import com.sgr.meijia.constants.CookieConst;
import com.sgr.meijia.constants.RedisConst;
import com.sgr.meijia.enums.ResultEnum;
import com.sgr.meijia.exception.MyException;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.util.StringUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * SellerAuthorizeAspect class<br/>
 *
 * @author hdonghong
 * @date 2018/04/11
 */
@Slf4j
@Aspect
@Configuration
public class SellerAuthorizeAspect {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @Pointcut("execution(public * com.sgr.meijia.controller*.*(..))" +
            "&& !execution(public * com.sgr.meijia.controller.LoginController.*(..))")
    public void verify() {

    }

    @Before("verify()")
    public void doVerfiry() {
        log.info("进入doVerify");

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        String token = request.getHeader(CookieConst.TOKEN);
        if (StringUtils.isEmpty(token)) {
            log.warn("【后台管理登录】 头部没有带token或者没有值. token = {}", token);
            throw new MyException(ResultEnum.TOKEN_ERROE_COOKIE);
        }
        log.info("当前value = {}", token);

        // redis里查询
        User result = (User) redisTemplate.opsForValue().get(String.format(RedisConst.TOKEN_RREFIX, token));
        if (result == null || StringUtils.isEmpty(result.getUser_id())) {
            log.warn("【后台管理登录】无效token，token = {}", token);
            throw new MyException(ResultEnum.TOKEN_ERROE_REDIS);
        }
        log.info("【后台管理登录】管理员：{} 正在访问请求：{}", result.getUser_id(), request.getRequestURI());
    }

}
