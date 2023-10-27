package com.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

//Provide necessary Annotation
@Entity
public class Account {
	
	//Provide necessary Annotation
    @Id
	private String accountNumber;
	private String holderName;
	private String phoneNumber;
	private String panNumber;
	private String accountType; //Savings or Current
	private double balanceAmount;
	
	@OneToMany(mappedBy = "accountObj")
	List<BankTransaction> transactions;
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}		
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalanceAmount() {
		return balanceAmount;
	}
	public void setBalanceAmount(double balanceAmount) {
		this.balanceAmount = balanceAmount;
	}
	public List<BankTransaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<BankTransaction> transactions) {
		this.transactions = transactions;
	}
	
	

	
}
