package com.gng.config;

import com.gng.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

@Configuration
public class HessianConfig {

    @Bean
    public HessianProxyFactoryBean courseServiceClient(){
        HessianProxyFactoryBean hessianProxyFactory = new HessianProxyFactoryBean();
        hessianProxyFactory.setServiceUrl("http://localhost:9091/CourseHessianService");
        hessianProxyFactory.setServiceInterface(CourseService.class);
        return hessianProxyFactory;
    }
}
