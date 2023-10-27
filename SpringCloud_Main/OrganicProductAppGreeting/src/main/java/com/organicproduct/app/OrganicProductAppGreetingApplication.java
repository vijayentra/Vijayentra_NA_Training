package com.organicproduct.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.organicproduct.controller"})
public class OrganicProductAppGreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganicProductAppGreetingApplication.class, args);
	}

}
