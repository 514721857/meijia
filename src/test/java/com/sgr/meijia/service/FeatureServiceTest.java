package com.sgr.meijia.service;

import com.sgr.meijia.bean.Feature;
import com.sgr.meijia.bean.Title;
import com.sgr.meijia.service.impl.FeatureServiceImp;
import com.sgr.meijia.service.impl.TitleServiceImp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest   //将启动工程
public class FeatureServiceTest {

    @Autowired
    FeatureServiceImp featureServiceImp;

  @Test
    public void getInsertFeature() {
        Feature feature=new Feature();
        feature.setName("实景设计");
        feature.setDescription("作图功能");
        featureServiceImp.InsertFeature(feature);

    }
    @Test

    public void getTitle() {

    }

    @Test
    public void delFeature() {
        featureServiceImp.DelFeature(34);

    }
    @Test
    public void UpdateTitle() {

    }
}