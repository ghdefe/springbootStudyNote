package com.chunmiao.filter.config;

import com.chunmiao.filter.filter.logFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import java.util.Enumeration;

@Configuration
public class filterConfig {

    @Bean
    FilterRegistrationBean registconfig(){
        FilterRegistrationBean fb = new FilterRegistrationBean();
        fb.setFilter(new logFilter());
        fb.addUrlPatterns("/*");
        fb.setName("filter1");
        fb.setOrder(1);
        return fb;
    }

}
