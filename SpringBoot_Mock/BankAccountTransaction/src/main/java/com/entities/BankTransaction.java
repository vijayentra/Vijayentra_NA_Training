package com.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Provide necessary Annotation
@Entity
public class BankTransaction {

	//Provide necessary Annotation

	@Id
	private String transactionId;
	private String transactionDate;
	private String transactionType;//Deposit or Withdraw
	private double amount;
	@ManyToOne
	@JoinColumn(name="accountNumber")
	private Account accountObj;

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public Account getAccountObj() {
		return accountObj;
	}

	public void setAccountObj(Account accountObj) {
		this.accountObj = accountObj;
	}	
}
