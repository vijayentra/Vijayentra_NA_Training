package com.controller;

import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.model.Book;
import com.service.BookService;

//use appropriate annotation to configure BookController as Controller
public class BookController {

	// use appropriate annotation
	private BookService bookService;

	// invoke the service class - addBook method.
	public String addBook(@ModelAttribute("book") Book book, BindingResult result, ModelMap model) {

		// fill the code
		return null;
	}

	// fill the code
	public String viewAllBooks(ModelMap model) {

		// fill the code
		return null;

	}

	// Use appropriate annotation
	public ModelAndView exceptionHandler(Exception e) {

		// fill the code
		return null;
	}

}
