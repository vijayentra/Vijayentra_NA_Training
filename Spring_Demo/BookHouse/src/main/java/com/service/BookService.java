package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.exception.InvalidBookException;
import com.model.Book;

//use appropriate annotation to configure BookService as a Service
@Service
public class BookService {
	private ArrayList<Book> bookList=new ArrayList<Book>();
	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> list) {
		this.bookList = list;
	}
	
	//Validate ISBN and add Book object into the bookList
	public boolean addBook(Book book) throws InvalidBookException {	
		boolean flag=true;
		
		for(Book b:bookList) {
			if(book.getIsbn().equals(b.getIsbn())) {
				flag = false;
				
			}
		}
		if(flag) {
			bookList.add(book);
			return flag;
		}
		
		throw new InvalidBookException("Book with "+book.getIsbn()+" already exists!");
		//fill the code
		//return false;
	}
	
	public ArrayList<Book> viewAllBooks(){
		//fill the code
		return bookList;
		
	}
	


}
