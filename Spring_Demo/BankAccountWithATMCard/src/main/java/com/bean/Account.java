package com.bean;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.DiscriminatorColumn;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "account_type", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorColumn(name = "account_type")
public class Account {
	@Id
	@Column(name = "account_number")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int accountNumber;
	private String holderName;
	private  double balance;
	
	@OneToOne(mappedBy = "account")
	private ATMCard atmCard;
	
	public Account() {
		
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public ATMCard getAtmCard() {
		return atmCard;
	}
	public void setAtmCard(ATMCard atmCard) {
		this.atmCard = atmCard;
	}
	
	
	


}
