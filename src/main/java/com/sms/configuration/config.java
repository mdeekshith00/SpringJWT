package com.sms.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    ModelMapper modelMapperBean() {
	        return new ModelMapper();
	    }

}
