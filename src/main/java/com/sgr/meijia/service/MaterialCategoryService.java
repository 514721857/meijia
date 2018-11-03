package com.sgr.meijia.service;

import com.sgr.meijia.bean.Material_Category;

public interface MaterialCategoryService {

    Material_Category InsertMaterial(Material_Category material_category);

    Material_Category UpdateMaterial(Material_Category material_category);

    Material_Category FindMaterial(Integer id);

    int DelMaterial(Integer id);



}
