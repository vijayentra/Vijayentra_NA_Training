package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String args[]) {
		
		//fill the code
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Cart c = context.getBean("cart",Cart.class);
		double total = 0.0;
		for(Product p : c.getProductList()) {
			total+=p.getPrice();
		}
		System.out.println("Total Price Rs: "+total);
	}
}
