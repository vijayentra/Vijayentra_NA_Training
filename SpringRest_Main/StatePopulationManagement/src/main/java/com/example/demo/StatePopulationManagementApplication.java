package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.controller com.service")
public class StatePopulationManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(StatePopulationManagementApplication.class, args);
	}

}
