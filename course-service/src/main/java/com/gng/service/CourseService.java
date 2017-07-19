package com.gng.service;


import com.gng.domain.Course;

import java.util.List;

public interface CourseService {

    boolean saveCourse(Course course);

    Course getCourse(long courseId);

    //path's all courses
    List<Course> getCourses(long pathId);
}
