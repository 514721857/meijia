package com.sgr.meijia.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Feature {

    @Id
    @GeneratedValue     //自增id
    Integer feature_id;

    String name;

    String description;

    String previewimage_url;//功能预览图片

    String previewvideo_url;//功能预览视频url

    String tutorial_url;//图文教程html Url

    public Feature() {
    }

    public Integer getFeature_id() {
        return feature_id;
    }

    public void setFeature_id(Integer feature_id) {
        this.feature_id = feature_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreviewimage_url() {
        return previewimage_url;
    }

    public void setPreviewimage_url(String previewimage_url) {
        this.previewimage_url = previewimage_url;
    }

    public String getPreviewvideo_url() {
        return previewvideo_url;
    }

    public void setPreviewvideo_url(String previewvideo_url) {
        this.previewvideo_url = previewvideo_url;
    }

    public String getTutorial_url() {
        return tutorial_url;
    }

    public void setTutorial_url(String tutorial_url) {
        this.tutorial_url = tutorial_url;
    }
}
