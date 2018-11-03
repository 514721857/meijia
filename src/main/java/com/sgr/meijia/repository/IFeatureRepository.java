package com.sgr.meijia.repository;

import com.sgr.meijia.bean.Feature;
import com.sgr.meijia.bean.Title;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFeatureRepository extends JpaRepository<Feature,Integer> {



}
