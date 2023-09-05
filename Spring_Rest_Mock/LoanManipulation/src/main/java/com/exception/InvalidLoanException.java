package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//Write appropriate annotation
@ResponseStatus(HttpStatus.NOT_FOUND)
public class InvalidLoanException extends RuntimeException{

	//Write a single argument constructor with message
	public InvalidLoanException(String msg) {
		super(msg);
	}
}
