package com.organicproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.organicproduct.proxy.ServiceProxy;

@RestController
public class ApplicationController {
	
	@Autowired
	ServiceProxy service; 

	@GetMapping("/greet")	
	public String retreiveInfo( ) {
		
		return service.greeting();
		
	}
	
	public String fallback(Exception e) {
		return "Sorry Service is unavailable";
	}
	
}
	 	  	    	    		        	 	
