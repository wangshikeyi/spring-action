package com.gng.config;

import com.gng.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;

@Configuration
public class HessianConfig {
    @Autowired
    private CourseService courseService;

    @Bean(name = "/CourseHessianService")
    public HessianServiceExporter hessianServiceExporter(){
        HessianServiceExporter hessianServiceExporter = new HessianServiceExporter();
        hessianServiceExporter.setService(courseService);
        hessianServiceExporter.setServiceInterface(CourseService.class);
        return hessianServiceExporter;
    }
}
