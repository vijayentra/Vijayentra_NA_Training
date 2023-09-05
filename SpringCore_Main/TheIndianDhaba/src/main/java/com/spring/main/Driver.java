package com.spring.main;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.exception.UnavailableDishException;
import com.spring.model.Dish;
import com.spring.service.DishService;
public class Driver {

	public static void main(String[] args) {
		// Fill the code
		Scanner sc = new Scanner(System.in);
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		DishService ds = context.getBean(DishService.class);
		Dish d1 = context.getBean(Dish.class);
		Dish d2 = context.getBean(Dish.class);
		
		System.out.println("First dish details\nEnter the dish name");
		String name1 = sc.nextLine();
		System.out.println("Enter the number of orders taken for the dish");
		int order1 = sc.nextInt();
		d1.setName(name1);
		d1.setOrderCount(order1);
		
		System.out.println("Second dish details\nEnter the dish name");
		sc.nextLine();
		String name2 = sc.nextLine();
		System.out.println("Enter the number of orders taken for the dish");
		int order2 = sc.nextInt();
		d2.setName(name2);
		d2.setOrderCount(order2);
		
		try {
		ds.calculateDishSalesAmount(d1);
		System.out.println("The bonus amount from the "+d1.getName()+" dish is $"+ d1.getBonusAmount());
		}
		catch(UnavailableDishException e) {
			System.out.println(e.getMessage());
		}
		try {
			ds.calculateDishSalesAmount(d2);
			System.out.println("The bonus amount from the "+d2.getName()+" dish is $"+ d2.getBonusAmount());
			}
			catch(UnavailableDishException e) {
				System.out.println(e.getMessage());
			}
		
	}

}
