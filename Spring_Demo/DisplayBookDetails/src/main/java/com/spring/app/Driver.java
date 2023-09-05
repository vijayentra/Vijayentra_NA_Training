package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Driver {
	
	public static Order loadBookDetails() {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		return context.getBean(Order.class);
	}

	public static void main(String[] args) {
		//fill the code
		Order order = loadBookDetails();
		order.displayOrderDetails();
	}

}
