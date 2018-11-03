package com.sgr.meijia.service.impl;

import com.sgr.meijia.bean.Course;
import com.sgr.meijia.repository.ICourseRepository;
import com.sgr.meijia.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    ICourseRepository iCourseRepository;

    @Override
    public Course InsertCourse(Course course) {
        return iCourseRepository.save(course);
    }

    @Override
    public Course UpdateCourse(Course course) {
        return iCourseRepository.save(course);
    }

    @Override
    public Course FindCourse(Integer course) {
        return iCourseRepository.findById(course).get();
    }

    @Override
    public int DelCourse(Integer course) {
        iCourseRepository.deleteById(course);
        return 0;
    }
}
