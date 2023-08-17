package com.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.mockito.Mock;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import com.model.Employee;
import com.service.EmployeeService;
import com.repo.EmployeeRepo;

@ExtendWith(MockitoExtension.class)
public class EmployeeTest {
	
	//Add the appropriate annotation
	EmployeeRepo repo;
	
	//Add the appropriate annotation
	EmployeeService service;
	
	//Test the addEmployee method in EmployeeService class
	public void test1AddEmployee() {
	    
		// Fill the code
		// Use when().thenReturn() method
		
	}
	
	//Test the deleteEmployee method in EmployeeService class
	public void test2DeleteEmployee() {
		
		// Fill the code
		//Use verify() method	
	}
	
	//Test the fetchEmployeeById method in EmployeeService class for a valid employeeId
	public void test3FetchEmployeeByEmployeeId() {
		
		// Fill the code
		// Use when().thenReturn() method
	}
	
	//Test the fetchEmployeeById method in EmployeeService class for an invalid employeeId
	public void test4FetchEmployeeByEmployeeIdWhenNull() {
		
		// Fill the code
		// Use assertThrows
	}
	
	//Test the fetchEmployee method in EmployeeService class
	public void test5FetchEmployee() {
		
		// Fill the code
		// Use when().thenReturn() method
	}
	
}
