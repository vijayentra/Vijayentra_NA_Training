package com.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.spring.bo.DishBO;
import com.spring.model.Dish;
import com.spring.service.DishService;

//Use appropriate annotation 
@Configuration
@ComponentScan("com.spring")
@PropertySource("restaurantDetails.properties")
public class ApplicationConfig {
	
//	@Bean
//	@Scope("prototype")
//	public Dish dish() {
//		return new Dish();
//	}
//	
//	@Bean
//	public DishBO dishBO() {
//		return new DishBO();
//	}
//	
//	@Bean
//	public DishService dishService(DishBO dishBO) {
//		return new DishService(dishBO);
//	}
	
}
