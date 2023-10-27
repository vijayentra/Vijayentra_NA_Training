package com.organicproduct.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class OrganicProductAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganicProductAppApplication.class, args);
	}

}
