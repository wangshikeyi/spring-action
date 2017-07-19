package com.gng.controller;

import com.gng.domain.Path;
import com.gng.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/path/{pathId}")
    public Path getPath(@PathVariable long pathId){
        Path path = new Path();
        //get path info from pathService.
        path.setCourses(courseService.getCourses(pathId));
        return path;
    }
}
