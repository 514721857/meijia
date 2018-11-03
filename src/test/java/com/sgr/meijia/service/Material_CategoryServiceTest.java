package com.sgr.meijia.service;

import com.sgr.meijia.bean.Feature;
import com.sgr.meijia.bean.Material_Category;
import com.sgr.meijia.service.impl.FeatureServiceImp;
import com.sgr.meijia.service.impl.Material_CategoryServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest   //将启动工程
public class Material_CategoryServiceTest {

    @Autowired
    Material_CategoryServiceImp material_categoryServiceImp;

  @Test
    public void getInsertFeature() {
        Material_Category feature=new Material_Category();
        feature.setName("窗帘");

      material_categoryServiceImp.InsertMaterial(feature);

    }
    @Test

    public void getTitle() {

    }

    @Test
    public void delFeature() {
        material_categoryServiceImp.DelMaterial(35);

    }
    @Test
    public void UpdateTitle() {

    }
}