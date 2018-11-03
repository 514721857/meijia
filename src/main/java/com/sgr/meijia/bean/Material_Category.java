package com.sgr.meijia.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Material_Category {

    @Id
    @GeneratedValue     //自增id
    Integer material_category_id;

    String name;

    public Material_Category() {
    }

    public Integer getMaterial_category_id() {
        return material_category_id;
    }

    public void setMaterial_category_id(Integer material_category_id) {
        this.material_category_id = material_category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
