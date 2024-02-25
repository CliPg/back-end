package com.clipg.config;

import com.clipg.controller.intercepter.ProjectInterceptor;
import com.clipg.controller.intercepter.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor projectInterceptor;
    @Autowired
    private ProjectInterceptor2 projectInterceptor2;

    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/pages/**").addResourceLocations("/pages/");
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        //只拦截/users
        //registry.addInterceptor(projectInterceptor).addPathPatterns("/users");
        //拦截users和users之后
        registry.addInterceptor(projectInterceptor).addPathPatterns("/users","/users/*");
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/users","/users/*");
    }
}
