package com.organicproduct.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

	
	@GetMapping(value="/welcome")
	public @ResponseBody String greeting( ) {
		
		return "TT Organic Farm Company is one of the famous company. It Export organic product all over India";
		
	}
}