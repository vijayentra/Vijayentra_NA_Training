package com.restaurant.exception;


import java.time.LocalDate;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import lombok.extern.slf4j.Slf4j;

@RestControllerAdvice
@Slf4j
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {


	@ExceptionHandler(Exception.class)
	public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request) {
		 log.error("An error occurred: " + ex.getMessage());
	        ExceptionResponse exceptionResponse = new ExceptionResponse(
	        		 LocalDate.now(),
	                 ex.getMessage(),
	                 request.getDescription(false),
	                 HttpStatus.INTERNAL_SERVER_ERROR.toString()
	        );
	        return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(BookTableInvalidException.class)
	public final ResponseEntity<ExceptionResponse> handleNotFoundException(BookTableInvalidException ex, WebRequest request) {
		 log.error("BookTableInvalidException: " + ex.getMessage());
	        ExceptionResponse exceptionResponse = new ExceptionResponse(
	            LocalDate.now(),
	            ex.getMessage(),
	            request.getDescription(false),
	            HttpStatus.NOT_FOUND.toString()
	        );
	        return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}

	@Override
	protected ResponseEntity<Object> handleMethodArgumentNotValid(MethodArgumentNotValidException ex,
		HttpHeaders headers, HttpStatusCode status, WebRequest request) {	
		log.error("Validation error occurred: " + ex.getMessage());
		
		 StringBuilder errors = new StringBuilder();
		    for (FieldError error : ex.getBindingResult().getFieldErrors()) {
		        errors.append(error.getField()).append(": ").append(error.getDefaultMessage()).append("\n");
		    }
		    for (ObjectError error : ex.getBindingResult().getGlobalErrors()) {
		        errors.append(error.getObjectName()).append(": ").append(error.getDefaultMessage()).append("\n");
		    }

		    String validationErrors = errors.toString();

		    ExceptionResponse exceptionResponse = new ExceptionResponse(
		        LocalDate.now(),
		        "Validation Failed",
		        validationErrors,
		        HttpStatus.BAD_REQUEST.toString()
		    );

//        ExceptionResponse exceptionResponse = new ExceptionResponse(
//            LocalDate.now(),
//            "Validation Failed",
//            request.getDescription(false),
//            HttpStatus.BAD_REQUEST.toString()
//        );
        return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}



}


