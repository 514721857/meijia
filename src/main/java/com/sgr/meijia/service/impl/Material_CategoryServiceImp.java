package com.sgr.meijia.service.impl;

import com.sgr.meijia.bean.Material_Category;
import com.sgr.meijia.repository.IMaterial_CategoryRepository;
import com.sgr.meijia.service.MaterialCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Material_CategoryServiceImp implements MaterialCategoryService {

    @Autowired
    IMaterial_CategoryRepository iMaterial_categoryRepository;

    @Override
    public Material_Category InsertMaterial(Material_Category material_category) {
        return iMaterial_categoryRepository.save(material_category);
    }

    @Override
    public Material_Category UpdateMaterial(Material_Category material_category) {
        return iMaterial_categoryRepository.save(material_category);
    }

    @Override
    public Material_Category FindMaterial(Integer id) {
        return iMaterial_categoryRepository.findById(id).get();
    }

    @Override
    public int DelMaterial(Integer id) {
        iMaterial_categoryRepository.deleteById(id);
        return 0;
    }
}
