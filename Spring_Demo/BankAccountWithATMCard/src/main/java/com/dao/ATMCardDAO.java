package com.dao;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.ATMCard;
import com.bean.Account;
import com.repository.ATMCardRepository;
import com.repository.AccountRepository;

@Service
public class ATMCardDAO {
	
	@Autowired
	private ATMCardRepository atmRepo;
	
	@Autowired
	private AccountRepository accRepo;
	
	private static final Logger logger = LoggerFactory.getLogger(ATMCardDAO.class);
	
	public void issueATMCardToAccount(int accountNumber, ATMCard atmCardObject) {
			//fill code
		Account a = accRepo.findById(accountNumber).
				orElseThrow(()->new RuntimeException("Invalid"));
		
		if(a.getAtmCard()==null) {
			atmCardObject.setAccount(a);
			atmRepo.save(atmCardObject);
			logger.info("ATM card successfully issued to account number "+accountNumber);
			return;
		}
		logger.info("ATM card not issued to account number "+ accountNumber);
	}

}
