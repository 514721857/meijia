package com.sgr.meijia.service;

import com.sgr.meijia.bean.Material;
import com.sgr.meijia.bean.Title;
import com.sgr.meijia.service.impl.MaterialServiceImp;
import com.sgr.meijia.service.impl.TitleServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest   //将启动工程
public class MaterialServiceTest {

    @Autowired
    MaterialServiceImp materialServiceImp;

    @Test
    public void getInsertTitle() {
        Material material=new Material();
        material.setName("窗帘2");
        material.setMaterial_category_id(36);
        material.setRemark("这是窗帘素材");
        materialServiceImp.InsertMaterial(material);

    }
    @Test
    public void getMaterial() {
        Material material=  materialServiceImp.FindMaterial(37);
        System.out.println("名称"+material.getName());
    }

    @Test
    public void delTitle() {
        int count=  materialServiceImp.DelMaterial(37);
        System.out.println("删除"+count);
    }
    @Test
    public void UpdateTitle() {
        Material material=  materialServiceImp.FindMaterial(38);
        material.setRemark("这个标题修改");
        materialServiceImp.UpdateMaterial(material);
    }
}