package com.gng.service.impl;

import com.gng.domain.Course;
import com.gng.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class CourseServiceImpl implements CourseService{
    @Override
    public boolean saveCourse(Course course) {
        log.info("course save successfully.");
        return false;
    }

    @Override
    public Course getCourse(long courseId) {
        log.info("course query successfully.");
        return null;
    }

    @Override
    public List<Course> getCourses(long pathId) {
        log.info("path's all courses query successfully.");
        return null;
    }
}
