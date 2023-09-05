package com.service;

import java.util.ArrayList;
import com.model.Book;

//use appropriate annotation to configure BookService as a Service

public class BookService {
	private ArrayList<Book> bookList=new ArrayList<Book>();
	
	//Validate ISBN and add Book object into the bookList
	public boolean addBook(Book book) {	
		//fill the code
		return false;
	}
	
	public ArrayList<Book> viewAllBooks(){
		//fill the code
		return null;
	}
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> list) {
		this.bookList = list;
	}


}
