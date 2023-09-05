package com.spring.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.config.ApplicationConfig;
import com.spring.model.Stall;
import com.spring.service.StallService;

import org.springframework.context.ApplicationContext;
public class Driver {

	public static void main(String[] args) {
		// Fill the code
		
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		StallService ss = context.getBean(StallService.class);
		Stall s1 = context.getBean(Stall.class);
		Stall s2 = context.getBean(Stall.class);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the stall type");
		String type1 = sc.next();
		System.out.println("Enter the stall set up cost");
		double cost1 = sc.nextDouble();
		System.out.println("Enter the total income from the stall");
		double income1 = sc.nextDouble();
		s1.setType(type1);
		s1.setSetUpCost(cost1);
		s1.setTotalIncome(income1);
		
		System.out.println("Enter the stall type");
		String type2 = sc.next();
		System.out.println("Enter the stall set up cost");
		double cost2 = sc.nextDouble();
		System.out.println("Enter the total income from the stall");
		double income2 = sc.nextDouble();
		s2.setType(type2);
		s2.setSetUpCost(cost2);
		s2.setTotalIncome(income2);
		
		ss.calculateNetProfit(s1);
		ss.calculateNetProfit(s2);
		
		
		System.out.println("The reward amount from the "+s1.getType()+" is $"+s1.getRewardAmount());
		System.out.println("The reward amount from the "+s2.getType()+" is $"+s2.getRewardAmount());
		
		
	}

}
