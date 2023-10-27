package com.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Account;
import com.repository.ATMCardRepository;
import com.repository.AccountRepository;


@Service
public class AccountDAO {
	@Autowired
	private AccountRepository accRepo;
	
	@Autowired
	private ATMCardRepository atmRepo; 
	
	private static final Logger logger = LoggerFactory.getLogger(AccountDAO.class);
	
	public void openAccount(Account account) {
		//fill code
		accRepo.save(account);
		logger.info("Account with id {} added successfully",account.getAccountNumber());
	}
	
	public List<Account> retrieveAccountBasedOnCardType(String cardType){
		//fill code
		List<Account> res = null;
		res = accRepo.findByAtmCard_CardType(cardType);
		if(res!=null) {
			logger.info("Account details with card type {} retrieved successfully", cardType);
			return res;
		}
		logger.info("No account with this card type "+ cardType);
		return res;
		
	}
}
