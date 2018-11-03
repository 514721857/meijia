package com.sgr.meijia.repository;

import com.sgr.meijia.bean.Material;
import com.sgr.meijia.bean.Title;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IMaterialRepository extends JpaRepository<Material,Integer> {


}
