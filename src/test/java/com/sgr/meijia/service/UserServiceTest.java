package com.sgr.meijia.service;

import com.sgr.meijia.bean.Title;
import com.sgr.meijia.bean.User;
import com.sgr.meijia.service.impl.TitleServiceImp;
import com.sgr.meijia.service.impl.UserServiceImp;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest   //将启动工程
public class UserServiceTest {

    @Autowired
    private UserServiceImp userService;

    @Autowired
    private TitleServiceImp titleService;

   @Test
    public void InsertUser() {
       User user=new User();
       user.setName("测试");
       user.setPassword("123456");
       user.setAccount("13602284381");
       user.setFunction("1");
       user.setTitle_id("1");

       User temp= userService.Regist(user);
       System.out.println("Account"+  temp.getAccount());
    }

    @Test
    public void UpdateUser() {
       User user=new User();
        user.setName("添加测试2");
        user.setPassword("123456");
        user.setAccount("13602284381");
        user.setFunction("1");
        user.setTitle_id("1");
        User temp= userService.UpdateUser(user);
        System.out.println("修改"+ temp.getName());
    }


    @Test
    public void Login() {
        User user=new User();
        user.setPassword("1234568");
        user.setAccount("13602284381");
        User temp= userService.Login(user);
        if(temp==null)
            return;
        System.out.println("登录"+ temp.getName());
    }

}