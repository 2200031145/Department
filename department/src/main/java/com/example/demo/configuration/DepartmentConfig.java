package com.example.demo.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.DepartmentService;

@Configuration
public class DepartmentConfig {

    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}