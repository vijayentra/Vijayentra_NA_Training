package com.restaurant.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restaurant.exception.BookTableInvalidException;
import com.restaurant.model.BookTable;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class RestaurantServiceImpl implements IRestaurantService {
	

	private static List<BookTable> bookList=new ArrayList<BookTable>();
	
	public static List<BookTable> getBookList() {
		return bookList;
	}

	public static void setBookList(List<BookTable> bookList) {
		RestaurantServiceImpl.bookList = bookList;
	}
	
	public RestaurantServiceImpl()
	{
	
	}

	@Override
	public BookTable bookATable(BookTable obj) throws BookTableInvalidException {
		

		
			
			return null;

	}

	@Override
	public BookTable calculateBill(String bookingId) {
		
		return null;
	}

	@Override
	public List<BookTable> viewBookingOnAParticularDate(LocalDate dateRequired) throws BookTableInvalidException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> findStarRatedCustomer() {
		return null;
	}

}
