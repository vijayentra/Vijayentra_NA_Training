package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Bus;
import com.service.BusService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/ticketbookingapp")
public class BusController {

	@Autowired
	private BusService service;
	
	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("/update/{busNo}/{noOfSeatsAvailable}")
	public Bus updateBus(@PathVariable int busNo, @PathVariable int noOfSeatsAvailable) {
		return service.updateBus(busNo, noOfSeatsAvailable);
	}
	
	@PreAuthorize("hasAnyRole('ADMIN','USER', 'MANAGER')")
	@GetMapping("/viewBusBySourceAndDestination/{source}/{destination}")
	public Bus viewBusBySourceAndDestination(@PathVariable String source,@PathVariable String destination){
		return service.viewBusBySourceAndDestination(source,destination);
	}
	
	@PreAuthorize("hasRole('MANAGER')")
	@GetMapping("/viewAllBusRating")
	public List<Bus> viewAllBusRating(){
		return service.viewAllBusRating();
	}
	
	@PreAuthorize("hasRole('USER')")
	@PutMapping("/rating/{busNo}/{rating}")
	public Bus provideRating(@PathVariable int busNo, @PathVariable int rating){
		return service.provideRating(busNo, rating);
	}
}
