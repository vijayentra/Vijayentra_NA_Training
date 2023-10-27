package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@SpringBootApplication
@ComponentScan({"com.*"})
@EnableMongoRepositories({"com.*"})
@EnableMethodSecurity(prePostEnabled = true)
public class BusTicketBookingAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusTicketBookingAppApplication.class, args);
	}

}
