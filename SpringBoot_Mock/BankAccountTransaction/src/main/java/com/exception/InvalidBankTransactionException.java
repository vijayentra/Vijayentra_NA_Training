package com.exception;

public class InvalidBankTransactionException extends Exception {

	public InvalidBankTransactionException(String message) {
		super(message);
	}
}
