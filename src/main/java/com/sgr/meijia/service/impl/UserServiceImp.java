package com.sgr.meijia.service.impl;

import com.sgr.meijia.bean.Title;
import com.sgr.meijia.bean.User;
import com.sgr.meijia.enums.ResultEnum;
import com.sgr.meijia.exception.MyException;
import com.sgr.meijia.repository.ITitleRepository;
import com.sgr.meijia.repository.IUsersRepository;
import com.sgr.meijia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    IUsersRepository iUsersRepository;

    @Autowired
    ITitleRepository iTitleRepository;

    @Override
    public User Regist(User user) {
        return iUsersRepository.save(user);
    }

    @Override
    public User UpdateUser(User user) {
        return iUsersRepository.save(user);
    }

    @Override
    public User getUser(int id) {
        Optional<User> user= iUsersRepository.findById(id);
        return  user.get();
    }

    @Override
    public User Login(User user) {
        User resutlUser=  iUsersRepository.findByAccountAndPassword(user.getAccount(),user.getPassword());
        if(resutlUser==null)
            return null;
        Title title= iTitleRepository.findById( Integer.parseInt(resutlUser.getTitle_id())).get();
        resutlUser.setTitle(title);
        if(user.getUuid_one()==null){//浏览器登录的话 不需要传uuid
            return resutlUser;
        }
        if(resutlUser.getUuid_one().equals("")||resutlUser.getUuid_one().equals("")){//当为空的时候就添加上去
            if(resutlUser.getUuid_one().equals("")){
                resutlUser.setUuid_one(user.getUuid_one());
            }else{
                resutlUser.setUuid_two(user.getUuid_one());
            }

            return resutlUser;

        }else{//当不为空的时候判断是否相等
            if(resutlUser.getUuid_one()==user.getUuid_one()||resutlUser.getUuid_two()==user.getUuid_one()){
                return resutlUser;
            }else{
                throw new MyException(ResultEnum.TOKEN_ERROE_HAVE);//在其他设备登录
            }
        }

//        return  null;
    }

    @Override
    public User ForbiddenUser(int id) {
        User user= iUsersRepository.findById(id).get();
        user.setRole("-1");
        return iUsersRepository.save(user);
    }
}
