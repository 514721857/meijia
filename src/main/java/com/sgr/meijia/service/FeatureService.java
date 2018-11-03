package com.sgr.meijia.service;

import com.sgr.meijia.bean.Feature;
import org.hibernate.sql.Update;

public interface FeatureService {

    Feature InsertFeature(Feature feature);

    Feature UpdateFeature(Feature feature);

    Feature FindFeature(Integer id);

    int DelFeature(Integer id);
}
