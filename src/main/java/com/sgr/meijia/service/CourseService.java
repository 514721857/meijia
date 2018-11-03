package com.sgr.meijia.service;

import com.sgr.meijia.bean.Course;

public interface CourseService {

    Course InsertCourse(Course course);

    Course UpdateCourse(Course course);

    Course FindCourse(Integer course);

    int DelCourse(Integer course);


}
