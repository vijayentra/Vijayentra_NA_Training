package com.organicproduct.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidProductException extends Exception{
	
	public InvalidProductException(String msg) {
		super(msg);
	}

}