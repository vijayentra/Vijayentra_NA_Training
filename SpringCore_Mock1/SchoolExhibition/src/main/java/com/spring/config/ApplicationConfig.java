package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.spring.bo.StallBO;
import com.spring.model.Stall;
import com.spring.service.StallService;

//Use appropriate annotation 
@Configuration
@ComponentScan()
public class ApplicationConfig {
	
	@Bean
	public StallService stallService(StallBO stallBO) {
		return new StallService(stallBO);
	}
	
	@Bean
	@Scope("prototype")
	public Stall stall() {
		return new Stall();
	}
	
	@Bean 
	public StallBO stallBO() {
		return new StallBO();
	}
}
