package com.sgr.meijia.repository;

import com.sgr.meijia.bean.Title;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITitleRepository extends JpaRepository<Title,Integer> {

    List<Title> findByName(String name);

}
