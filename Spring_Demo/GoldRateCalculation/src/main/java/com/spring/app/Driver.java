package com.spring.app;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static GoldRateInfo loadGoldRateDetails() {
		//fill the code
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        return context.getBean("rateInfoObj", GoldRateInfo.class);
	}
	
public static void main(String[] args){
	
	Scanner in=new Scanner(System.in);
	GoldRateInfo gd = loadGoldRateDetails();
	//fill the code
	System.out.println("Enter the carat:");
	int c = in.nextInt();
	System.out.println("Enter Total Grams:");
	double g = in.nextDouble();
	System.out.println("Total Gold Rate is Rs:"+gd.calculateGoldRate(c, g));
	
	
}

}
	 	  	    	    		        	 	
