package com.organicproduct.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrganicProductAppServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrganicProductAppServiceApplication.class, args);
	}

}
