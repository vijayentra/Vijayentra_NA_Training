package com.exception;

public class InvalidFacultyException extends Exception{

	// Include a public Single argument Constructor and set the message through super class Constructor
	public InvalidFacultyException(String msg) {
		super(msg);
	}
	
}