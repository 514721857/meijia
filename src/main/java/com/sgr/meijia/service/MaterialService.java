package com.sgr.meijia.service;

import com.sgr.meijia.bean.Material;

public interface MaterialService {

    Material InsertMaterial(Material material);

    Material UpdateMaterial(Material material);

    Material FindMaterial(Integer id);

    int DelMaterial(Integer id);


}
