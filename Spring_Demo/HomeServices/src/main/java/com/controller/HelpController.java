package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.model.HelperBean;
import com.service.HelperService;



public class HelpController {
	
	
	private HelperService helpService;
	
	
	public String showPage( HelperBean helperBean, 
			BindingResult result) {
		
		return null;

	}
	
	
	public  Map<String, String> buildState(){
		return null;

	}


	
	public String calculateTotalCost(HelperBean helperBean, 
			ModelMap model,BindingResult result) {
		
		return null;
	}
	
	
	
	
}
