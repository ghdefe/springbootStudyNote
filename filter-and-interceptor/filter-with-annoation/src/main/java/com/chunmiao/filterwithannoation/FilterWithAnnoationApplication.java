package com.chunmiao.filterwithannoation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class FilterWithAnnoationApplication {

    public static void main(String[] args) {
        SpringApplication.run(FilterWithAnnoationApplication.class, args);
    }

}
