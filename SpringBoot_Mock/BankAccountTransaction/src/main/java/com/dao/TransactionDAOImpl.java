package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.entities.Account;
import com.entities.BankTransaction;
import com.exception.InvalidBankTransactionException;
import com.repository.AccountRepository;
import com.repository.TransactionRepository;

@Component
public class TransactionDAOImpl implements ITransactionDAO {
	
	//Provide code to Inject TransactionRepository and AccountRepository
	//Provide code to Inject AccountRepository, if needed
	@Autowired
	TransactionRepository transactionRepository;
	@Autowired
	AccountRepository accountRepository;
	
	@Override
	public BankTransaction insertTransaction(BankTransaction transactionObj,String accountNumber) throws InvalidBankTransactionException{
		
		//fill code
		Account account = accountRepository.findByAccountNumber(accountNumber);
		if(account == null) {
			throw new InvalidBankTransactionException("Account not found with account number: "+accountNumber );
		}
		
		String transactionType = transactionObj.getTransactionType();
		double amount = transactionObj.getAmount();
		
		if("Deposit".equalsIgnoreCase(transactionType)) {
			account.setBalanceAmount(account.getBalanceAmount()+amount);
		}
		else if ("Withdraw".equalsIgnoreCase(transactionType)) {
			account.setBalanceAmount(account.getBalanceAmount()-amount);
		}
		transactionObj.setAccountObj(account);
		accountRepository.save(account);
		return transactionRepository.save(transactionObj);
	}
	
	@Override
	public List<BankTransaction> viewTransactionByAccountNumber(String accountNumber) throws InvalidBankTransactionException
	{
		//fill code
		Account findByAccountNumber = accountRepository.findByAccountNumber(accountNumber);
		if(findByAccountNumber == null) {
			throw new InvalidBankTransactionException("Account not found with account number: "+accountNumber);
		}
		
		return transactionRepository.findByAccountObj_AccountNumber(accountNumber);	
	}
	
	@Override
	public List<BankTransaction> viewTransactionByTransactionType(String transactionType)
	{
		//fill code
		
		return transactionRepository.findByTransactionType(transactionType);	
	}
	
	@Override
	public List<BankTransaction> viewTransactionByTransactionTypeAndAmount(String transactionType,double amount)
	{
		//fill code
		
		return transactionRepository.findByTransactionTypeAndAmountGreaterThanEqual(transactionType,amount);	
	}

}
