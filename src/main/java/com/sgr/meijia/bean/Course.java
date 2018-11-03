package com.sgr.meijia.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.xml.crypto.Data;

@Entity
public class Course {
/*
    course_id : 主键，教学课程ID

    name : 教学课程名称

    description : 课程描述

    view_count : 观看次数

    duration : 视频时长

    create_date : 创建时间

    video_url : 视频地址

    html_url : 图文教学HTML URL*/

  @Id
  @GeneratedValue     //自增id
  Integer course_id;

  String name;//教学课程名称

  String description;//课程描述

  Integer view_count;//观看次数

  Data create_date;//创建时间

  String duration;//视频时长

  String video_url;//视频地址

  String html_url;//图文教学HTML URL

    public Course() {
    }

    public Integer getCourse_id() {
        return course_id;
    }

    public void setCourse_id(Integer course_id) {
        this.course_id = course_id;
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

    public Integer getView_count() {
        return view_count;
    }

    public void setView_count(Integer view_count) {
        this.view_count = view_count;
    }

    public Data getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Data create_date) {
        this.create_date = create_date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getVideo_url() {
        return video_url;
    }

    public void setVideo_url(String video_url) {
        this.video_url = video_url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }
}
