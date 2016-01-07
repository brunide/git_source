package com.rastyle.gradle.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.rastyle.gradle.IndexController;

@Configuration
public class IndexConfig {
	
	@Bean
	public IndexController indexController(){
		return new IndexController();
	}
}
