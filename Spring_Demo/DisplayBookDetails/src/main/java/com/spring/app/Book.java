package com.spring.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//fill the code
@Component
public class Book {
	
	//fill the code
	@Value("1")
	private int bookId;
	//fill the code
	@Value("Vijayentra")
	private String bookAuthor;
	//fill the code
	@Value("Nothing")
	private String bookTitle;
	//fill the code
	@Value("1999")
	private double price;

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	
	

}
