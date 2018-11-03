package com.sgr.meijia.controller;

import com.sgr.meijia.bean.Result;
import com.sgr.meijia.bean.Title;
import com.sgr.meijia.bean.User;
import com.sgr.meijia.repository.ITitleRepository;
import com.sgr.meijia.service.impl.TitleServiceImp;
import com.sgr.meijia.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private TitleServiceImp titleServiceImp;

    /**
     * 测试
     * @return
     */
    @GetMapping(value = "/user/test")
    public String getTest(){

        return "你好SpringBoot成功。。。";
    }
    /**
     * 添加一个title
     * @param name 名字
     * @return 返回插入的title
     */
    @PostMapping(value = "user/add-title")
    public Result<Title> AddTitle(@RequestParam("name") String name){
        Title title=new Title();
        title.setName(name);
        return ResultUtil.success(titleServiceImp.InsertTitle(title));
    }

}
