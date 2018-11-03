package com.sgr.meijia.service.impl;

import com.sgr.meijia.bean.Feature;
import com.sgr.meijia.repository.IFeatureRepository;
import com.sgr.meijia.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FeatureServiceImp implements FeatureService {

    @Autowired
    IFeatureRepository iFeatureRepository;
    @Override
    public Feature InsertFeature(Feature feature) {
        return iFeatureRepository.save(feature);
    }

    @Override
    public Feature UpdateFeature(Feature feature) {
        return iFeatureRepository.save(feature);
    }

    @Override
    public Feature FindFeature(Integer id) {
        return iFeatureRepository.findById(id).get();
    }

    @Override
    public int DelFeature(Integer id) {
        iFeatureRepository.deleteById(id);
        return 0;
    }
}
