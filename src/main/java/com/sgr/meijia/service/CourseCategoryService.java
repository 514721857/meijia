package com.sgr.meijia.service;

import com.sgr.meijia.bean.Course;
import com.sgr.meijia.bean.Course_Category;

public interface CourseCategoryService {

    Course_Category InsertCourse_Category(Course_Category course);

    Course_Category UpdateCourse_Category(Course_Category course);

    Course_Category FindCourse_Category(Integer course);

    int DelCourse_Category(Integer course);


}
