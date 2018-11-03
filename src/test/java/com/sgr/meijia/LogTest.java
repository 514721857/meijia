package com.sgr.meijia;

import com.sgr.meijia.bean.Title;
import com.sgr.meijia.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest   //将启动工程
@Slf4j
public class LogTest {
    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void findOneTest(){
        String str="调试";
        redisTemplate.opsForValue().set("name","tom");
//      String test=  ;
        log.info(str+"info"+redisTemplate.opsForValue().get("name"));
  /*
      log.error(str+"error");
      log.warn(str+"warn...");
      log.debug(str+"debug");
      log.info(str+"info");*/
    }

}
