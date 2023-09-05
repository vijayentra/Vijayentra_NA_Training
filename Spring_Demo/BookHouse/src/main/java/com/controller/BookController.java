package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.exception.InvalidBookException;
import com.model.Book;
import com.service.BookService;

//use appropriate annotation to configure BookController as Controller
@Controller
public class BookController {

	// use appropriate annotation
	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String showIndex() {
		return "index";
	}

	@RequestMapping(value = "/showPage", method = RequestMethod.GET)
	public String showPage(@ModelAttribute("book") Book book) {
		return "showPage";
	}

	// invoke the service class - addBook method.
	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public String addBook(@ModelAttribute("book") Book book, BindingResult result, ModelMap model)
			throws InvalidBookException {

		// fill the code
		bookService.addBook(book);
		model.addAttribute("message", "Book added successfully");
		return "showPage";
	}

	// fill the code
	@RequestMapping(value = "/viewList", method = RequestMethod.GET)
	public String viewAllBooks(@ModelAttribute("book") Book book, ModelMap model) {

		// fill the code
		List<Book> list = bookService.viewAllBooks();
		model.addAttribute("bookList", list);
		return "viewList";

	}

	@ModelAttribute("bookCategory")
	public List<String> populateBookCategory() {
		List<String> bookCategory = new ArrayList<>();
		bookCategory .add("Science");
		bookCategory .add("Humor");
		bookCategory .add("Novel");
		bookCategory .add("Health");
		bookCategory .add("Travel");
		bookCategory .add("Motivational");
		bookCategory .add("Art");
		bookCategory .add("Encyclopedia");
		bookCategory .add("Biography");
		bookCategory .add("Cooking");

		return bookCategory ;

	}
	// Use appropriate annotation
	@ExceptionHandler(InvalidBookException.class)
	public ModelAndView exceptionHandler(Exception e) {

		ModelAndView model = new ModelAndView();
		model.setViewName("exceptionPage");
		model.addObject("message",e.getMessage());
		return model;
	}

}
