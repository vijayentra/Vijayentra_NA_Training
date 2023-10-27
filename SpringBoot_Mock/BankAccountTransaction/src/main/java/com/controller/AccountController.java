package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.Account;
import com.exception.InvalidAccountException;
import com.service.IAccountService;


//Provide necessary Annotation
@RestController
public class AccountController {
	
	//Provide necessary Annotation
	@Autowired
	IAccountService accountService;
	
	//Provide necessary Annotation and fill code

	@PostMapping("/openAccount")
	public  Account openAccount(@RequestBody Account account) {
	
		return accountService.openAccount(account);
		
	}
	
	@PutMapping("/updateAccountHolderPhoneNumber/{accountNumber}/{phoneNumber}")
	public Account updateAccountHolderPhoneNumber(@PathVariable String accountNumber,@PathVariable String phoneNumber) throws InvalidAccountException {
	
		return accountService.updateAccountHolderPhoneNumber(accountNumber, phoneNumber);
		
	}
	
	@GetMapping("/viewAccountByAccountNumber/{accountNumber}")
	public Account viewAccountByAccountNumber(@PathVariable String accountNumber) throws InvalidAccountException {
	
		return accountService.viewAccountByAccountNumber(accountNumber);
		
	}
	
	@GetMapping("/viewAccountByBalance/{balance}")
	public List<Account> viewAccountByBalance(@PathVariable double balance) {
	
		return accountService.viewAccountByBalance(balance);
		
	}

	
}

	
