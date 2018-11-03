package com.sgr.meijia.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest   //将启动工程
public class UserControllerTest {

    @Autowired UserController userController;

    @Test
    public void getTest() {
    }

    @Test
    public void addGirl() {
        userController.AddTitle("精英测试1");

    }
}