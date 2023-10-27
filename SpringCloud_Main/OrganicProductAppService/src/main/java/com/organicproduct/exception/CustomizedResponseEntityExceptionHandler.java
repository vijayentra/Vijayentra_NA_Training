package com.organicproduct.exception;

import java.time.LocalDate;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		log.error("Exception occured: " + ex.getMessage());
		ExceptionResponse response = new ExceptionResponse(
				LocalDate.now(),
				ex.getMessage(),
				request.getDescription(false),
				"Internet Server Error");
				
		return new ResponseEntity(response, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(InvalidProductException.class)
	public final ResponseEntity<ExceptionResponse> handleNotFoundException(InvalidProductException ex, WebRequest request) {	 	  	    	    		        	 	
		log.error("Exception occured: " + ex.getMessage());
		ExceptionResponse response = new ExceptionResponse(
				LocalDate.now(),
				ex.getMessage(),
				request.getDescription(false),
				"Not Found");
				
		return new ResponseEntity(response, HttpStatus.NOT_FOUND);
	}

	
	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatusCode status, WebRequest request) {	
	
		log.error("Validation error occured: " + ex.getMessage());
		ExceptionResponse response = new ExceptionResponse(
				LocalDate.now(),
				ex.getMessage(),
				request.getDescription(false),
				"Bad Request");
				
		return new ResponseEntity(response, HttpStatus.BAD_REQUEST);
	}

}
