package com.sgr.meijia.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course_Category {

    @Id
    @GeneratedValue     //自增id
    Integer course_category_id;

    String name;

    public Course_Category() {
    }

    public Integer getCourse_category_id() {
        return course_category_id;
    }

    public void setCourse_category_id(Integer course_category_id) {
        this.course_category_id = course_category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
