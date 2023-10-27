package com.restaurant.controller;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.exception.BookTableInvalidException;
import com.restaurant.model.BookTable;
import com.restaurant.service.IRestaurantService;

import jakarta.validation.Valid;

@RestController
public class RestaurantController {
	
	@Autowired
	IRestaurantService service;
	
	@PostMapping("/book")
	public BookTable bookATable(BookTable bookObj) throws BookTableInvalidException {
		return service.bookATable(bookObj);
	}

	
	@PutMapping("/calculate/{bookingId}")
	public BookTable calculateBill(@PathVariable String bookingId){

		return service.calculateBill(bookingId);
	}
	
	@GetMapping("/viewBooking/{dateRequired}")
	public List<BookTable> viewBookingOnAParticularDate(@PathVariable @Valid String dateRequired) throws BookTableInvalidException {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate date = LocalDate.parse(dateRequired, formatter);
	        return service.viewBookingOnAParticularDate(date);
		
	}
	
	@GetMapping("/starRated")
	public List<String> findStarRatedCustomer(){
		return service.findStarRatedCustomer();
	}

	


}
