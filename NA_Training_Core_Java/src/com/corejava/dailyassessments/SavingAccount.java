package com.corejava.dailyassessments;

public class SavingAccount {
	int id;
	String name;
	double balance;
	
	public SavingAccount(int id,String name,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public void withdraw(float amount) {
		if(balance-amount<0)
			System.out.println("insufficient balance");
		else {
			balance=balance-amount;
			System.out.println("allowed new balance is "+ balance);
		}
	}
	public void deposit(float amount) {
		balance = balance+amount;
		System.out.println("allowed, new balance is "+ balance);
	}
	public static void main(String[] args) {
		SavingAccount acc = new SavingAccount(1,"vijay",10000);
		acc.withdraw(2000);
		acc.withdraw(10000);
		acc.deposit(25000);
	}
}

