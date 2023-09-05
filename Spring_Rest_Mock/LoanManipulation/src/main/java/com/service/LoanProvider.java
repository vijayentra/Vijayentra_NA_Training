package com.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.model.Loan;

@Service
public class LoanProvider {
	
	private ArrayList<Loan> loanList=new ArrayList<Loan>();
	
	public ArrayList<Loan> getLoanList() {
		return loanList;
	}

	public void setLoanList(ArrayList<Loan> loanList) {
		this.loanList = loanList;
	}

	public LoanProvider()
	{
		Loan loanObj1=new Loan("P1","Arun","Personal",250000);
		Loan loanObj2=new Loan("V1","Rahul","Vehicle", 300000);
		Loan loanObj3=new Loan("H1","Vignesh","Home",700000);
		Loan loanObj4=new Loan("V2","Mahesh","Vehicle",40000);
		Loan loanObj5=new Loan("H2","Azhar","Home", 640000);
		Loan loanObj6=new Loan("V3","Pranav","Vehicle",120000);
		Loan loanObj7=new Loan("P2","Pooja","Personal",60000);
		Loan loanObj8=new Loan("V4","Sunil","Vehicle",90000);
			
		loanList.add(loanObj1);
		loanList.add(loanObj2);
		loanList.add(loanObj3);
		loanList.add(loanObj4);
		loanList.add(loanObj5);
		loanList.add(loanObj6);
		loanList.add(loanObj7);
		loanList.add(loanObj8);		

	}
	
	public boolean addLoan(Loan loanObj)
	{
		
		return loanList.add(loanObj);
	}
	
	public Loan viewLoanById(String loanId) {
		Loan loan = null;
		for(Loan l : getLoanList()) {
			if(l.getLoanId()==loanId) {
				loan = l;
				break;
			}
		}
		return loan;
	}

	public ArrayList<Loan> viewLoanByType(String loanType)
	{	
		ArrayList<Loan> list = new ArrayList<>();
		for(Loan l : loanList) {
			if(l.getLoanType()==loanType) {
				list.add(l);
			}
		}
		return list;
	}
	
	public boolean updateLoanAmount(String loanId,double loanAmount)
	{	
		boolean res = false;
		for(Loan l : loanList) {
			if(l.getLoanId()==loanId) {
				l.setLoanAmount(loanAmount);
				res=true;
				break;
			}
		}
		return res;
	}	
	
	public boolean deleteLoanInfo(String loanId ) {
		boolean result = false;
		for(Loan l : getLoanList()) {
			if(l.getLoanId()==loanId) {
				result = loanList.remove(l);
				break;
			}
		}
		return result;		
	}
}
