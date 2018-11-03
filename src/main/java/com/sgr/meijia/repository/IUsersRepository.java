package com.sgr.meijia.repository;

import com.sgr.meijia.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<User,Integer> {
    User findByAccountAndPassword(String account,String password);
}
