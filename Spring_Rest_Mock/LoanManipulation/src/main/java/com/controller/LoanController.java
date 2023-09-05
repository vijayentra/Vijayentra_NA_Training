package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exception.InvalidLoanException;
import com.model.Loan;
import com.service.LoanProvider;

@RestController
public class LoanController {

	@Autowired
	private LoanProvider loanProvider;

	@PostMapping("/LMS/addLoan")
	public boolean addLoan(Loan loanObj)
	{
		return loanProvider.addLoan(loanObj);
	}
	
	@GetMapping("/LMS/viewLoanById/{loanId}")
	public Loan viewLoanById(@PathVariable String loanId) throws InvalidLoanException{
		Loan res = loanProvider.viewLoanById(loanId);
	    if(res!=null) {
	    	return res;
	    }
	    throw new InvalidLoanException("Loan id "+loanId+ " is invalid");
	}

	@GetMapping("/LMS/viewLoanByType/{loanType}")
	public ArrayList<Loan> viewLoanByType(@PathVariable String loanType) 
	{
		return loanProvider.viewLoanByType(loanType);
	}
	
	@PutMapping("/LMS/updateLoanAmount/{loanId}/{loanAmount}")
	public boolean updateLoanAmount(@PathVariable String loanId,@PathVariable double loanAmount)
	{
		return loanProvider.updateLoanAmount(loanId, loanAmount);
	}
	
	@DeleteMapping("LMS/deleteLoan/{loanId}")
	public boolean deleteLoanInfo(@PathVariable String loanId ) 
	{
		return loanProvider.deleteLoanInfo(loanId);
	}

}

