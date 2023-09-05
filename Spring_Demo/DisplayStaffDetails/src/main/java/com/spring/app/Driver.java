package com.spring.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static Department loadStaffDetails()
	{
		//fill the code
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
	        return context.getBean("departmentObj", Department.class);
	}

	public static void main(String[] args) {
		//fill the code
		Department department = loadStaffDetails();
        department.displayStaffDetails();
	}

}
