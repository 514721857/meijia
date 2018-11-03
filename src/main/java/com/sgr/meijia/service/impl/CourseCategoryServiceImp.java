package com.sgr.meijia.service.impl;

import com.sgr.meijia.bean.Course;
import com.sgr.meijia.bean.Course_Category;
import com.sgr.meijia.repository.ICourse_CategoryRepository;
import com.sgr.meijia.service.CourseCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseCategoryServiceImp implements CourseCategoryService {

    @Autowired
    ICourse_CategoryRepository iCourse_categoryRepository;
    @Override
    public Course_Category InsertCourse_Category(Course_Category course) {
        return iCourse_categoryRepository.save(course);
    }

    @Override
    public Course_Category UpdateCourse_Category(Course_Category course) {
        return iCourse_categoryRepository.save(course);
    }

    @Override
    public Course_Category FindCourse_Category(Integer course) {
        return iCourse_categoryRepository.findById(course).get();
    }

    @Override
    public int DelCourse_Category(Integer course) {
        iCourse_categoryRepository.deleteById(course);
        return 0;
    }
}
