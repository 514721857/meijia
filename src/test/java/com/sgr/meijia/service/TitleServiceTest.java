package com.sgr.meijia.service;

import com.sgr.meijia.bean.Title;
import com.sgr.meijia.bean.User;
import com.sgr.meijia.service.impl.TitleServiceImp;
import com.sgr.meijia.utils.ResultUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest   //将启动工程
public class TitleServiceTest {

    @Autowired
    TitleServiceImp titleServiceImp;

    @Test
    public void getInsertTitle() {
        Title title=new Title();
        title.setName("名称");
        Title temp=   titleServiceImp.InsertTitle(title);
        System.out.println("插入名称"+temp.getName());
    }
    @Test

    public void getTitle() {
      Title title=  titleServiceImp.findTitle(2);
        System.out.println("名称"+title.getName());
    }

    @Test
    public void delTitle() {

        int count=  titleServiceImp.DelTitle(2);
        System.out.println("删除"+count);
    }
    @Test
    public void UpdateTitle() {
        Title title=  titleServiceImp.findTitle(2);
        title.setName("精英修改");
        Title temp=  titleServiceImp.UpdateTitle(title);
        System.out.println("修改"+temp.getName());
    }
}