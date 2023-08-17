package com.corejava.dailyassessments;

public class CurrentAccount {
	int id;
	String name;
	double balance;
	
	
	public CurrentAccount(int id,String name,double balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public double overdraft() {
		final double limit = 0.3f*balance;
		return limit;
	}
	public void withdraw(double amount,double overdraft) {
		if((balance+overdraft)-amount  <0) 
			System.out.println("insufficient balance");
		else {
			balance=balance-amount;
			if(balance<0)
				System.out.println("allowed new balance is 0");
			else
				System.out.println("allowed new balance is "+ balance);
		}
	}
	public void deposit(float amount) {
		balance = balance+amount;
		System.out.println("allowed, new balance is "+ balance);
	}
	public static void main(String[] args) {
		double limit;
		CurrentAccount acc = new CurrentAccount(1,"vijay",10000);
		limit = acc.overdraft();
		acc.withdraw(5000,limit);
		acc.withdraw(5000,limit);
		acc.withdraw(4000,limit);
		acc.deposit(3000);
	}
}
