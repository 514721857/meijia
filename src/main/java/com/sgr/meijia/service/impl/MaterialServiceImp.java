package com.sgr.meijia.service.impl;

import com.sgr.meijia.bean.Material;
import com.sgr.meijia.repository.IMaterialRepository;
import com.sgr.meijia.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MaterialServiceImp implements MaterialService {

    @Autowired
    IMaterialRepository iMaterialRepository;

    @Override
    public Material InsertMaterial(Material material) {
        return iMaterialRepository.save(material);
    }

    @Override
    public Material UpdateMaterial(Material material) {
        return iMaterialRepository.save(material);
    }

    @Override
    public Material FindMaterial(Integer id) {
        return iMaterialRepository.findById(id).get();
    }

    @Override
    public int DelMaterial(Integer id) {
        iMaterialRepository.deleteById(id);
        return 0;
    }
}
