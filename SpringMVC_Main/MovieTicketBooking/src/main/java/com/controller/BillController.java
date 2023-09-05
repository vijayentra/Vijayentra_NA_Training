package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Ticket;
import com.service.BillService;

//use appropriate annotation to configure BillController as Controller
@Controller
public class BillController {
	
//	Use appropriate annotation
	@Autowired
	private BillService billService;

	//invoke the service class - calculateTotalCost method.
	
	@RequestMapping(value = "/billDesk", method = RequestMethod.POST)
	public String calculateTotalCost(@ModelAttribute("ticket") Ticket ticket, 
			BindingResult result,ModelMap model) {
		//fill the code
		billService.calculateTotalCost(ticket);
		model.addAttribute("","");
		return "billDesk";
	}

	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("ticket") Ticket ticket) {
		return "showPage";
	}
	
	@ModelAttribute("ticketList")
	public List<String> populateTicketType(){
		List<String> ticketType = new ArrayList<>();
		ticketType.add("Balcony");
		ticketType.add("Floor");
		ticketType.add("KingCircle");
		ticketType.add("QueenCircle");
		return ticketType;
	}
	
	@ModelAttribute("addOnList")
	public List<String> populateRefreshmentOption(){
		List<String> refreshOption = new ArrayList<>();
		refreshOption.add("YES");
		refreshOption.add("NO");
		return refreshOption;
	}
}
