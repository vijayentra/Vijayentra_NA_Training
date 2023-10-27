package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.entities.Account;
import com.exception.InvalidAccountException;
import com.repository.AccountRepository;

@Component
public class AccountDAOImpl implements IAccountDAO{
	
	//Provide code to Inject AccountRepository
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public Account openAccount(Account account) {
		
		//fill code
		
		return accountRepository.save(account);
	}
	
	@Override
	public Account updateAccountHolderPhoneNumber(String accountNumber,String phoneNumber) throws InvalidAccountException {
		
		//fill code
		Account findByAccountNumber = accountRepository.findByAccountNumber(accountNumber);
		
		if(findByAccountNumber == null) {
			throw new InvalidAccountException("Account not found with account number: " +accountNumber);
		}
		findByAccountNumber.setPhoneNumber(phoneNumber);
		return accountRepository.save(findByAccountNumber);
	}
	
	@Override
	public Account viewAccountByAccountNumber(String accountNumber) throws InvalidAccountException {
		
		//fill code
		
		 Account findByAccountNumber = accountRepository.findByAccountNumber(accountNumber);
		 if(findByAccountNumber == null) {
			 throw new InvalidAccountException("Account not found with account number: "+accountNumber);
		 }
		return findByAccountNumber;	
	}

	@Override
	public List<Account> viewAccountByBalance(double balance) {
		
		//fill code
		
		return accountRepository.findByBalanceAmountGreaterThanEqual(balance);
	}

}
