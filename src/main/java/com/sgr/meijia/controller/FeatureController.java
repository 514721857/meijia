package com.sgr.meijia.controller;

import com.sgr.meijia.bean.Result;
import com.sgr.meijia.bean.Title;
import com.sgr.meijia.service.impl.FeatureServiceImp;
import com.sgr.meijia.service.impl.TitleServiceImp;
import com.sgr.meijia.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureController {

    @Autowired
    private FeatureServiceImp featureServiceImp;



}
