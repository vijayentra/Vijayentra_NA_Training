package com.spring.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import com.spring.model.Appointment;
import com.spring.service.AppointmentService;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//use appropriate annotation to configure AppointmentController as Controller
@RestController
public class AppointmentController {
	
//	Use appropriate annotation
	@Autowired
	private AppointmentService service;	  	   	      	 	

//	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
//	public String showPage(@ModelAttribute("appointment") Appointment appointment) {
//		return "showPage";
//	}
	
	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public ModelAndView showPage() {
	    ModelAndView modelAndView = new ModelAndView("showPage");
	    modelAndView.addObject("appointment", new Appointment());
	    modelAndView.addObject("consultationList", populateConsultation());
	    return modelAndView;
	}
	
	@ModelAttribute("consultationList")
	public ArrayList<String> populateConsultation(){
		ArrayList<String> list = new ArrayList<>();
		list.add("Optometry");
		list.add("Psychology");
		list.add("Pediatrist");
		list.add("Physical therapy");
		list.add("Dentistry");
		return list;
	}
	//invoke the service class - bookAppointment method.
	@RequestMapping(value = "/consultation", method = RequestMethod.POST)
	public String bookAppointment(@ModelAttribute("appointment") Appointment appointment, ModelMap model) {		
		int charges = service.bookAppointment(appointment);
		model.addAttribute("message", "Thanks for visiting. Your consultation charges is Rs. " + charges);
		return "showPage";
	}
	
//	@RequestMapping(value = "/consultation", method = RequestMethod.POST)
//	public ModelAndView bookAppointment(@ModelAttribute("appointment") Appointment appointment) {
//	    ModelAndView modelAndView = new ModelAndView("showPage");
//	    int charges = service.bookAppointment(appointment);
//	    modelAndView.addObject("message", "Thanks for visiting. Your consultation charges is Rs. " + charges);
//	    return modelAndView;
//	}
	
}
