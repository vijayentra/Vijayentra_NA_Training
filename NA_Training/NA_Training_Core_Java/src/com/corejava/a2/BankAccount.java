package com.corejava.a2;

public abstract class BankAccount {
	String AccName;
	public BankAccount(String AccName) {
		this.AccName=AccName;
	}
	public abstract double Cash();
	public static void main(String[] args) {
		BankAccount[] acc = new BankAccount[2];
		acc[0]=new Savings("savings",200000);
		acc[1]=new Current("current",400000);
		double total_cash=0;
		for(BankAccount b : acc) {
			total_cash+=b.Cash();
		}
		System.out.println(total_cash);
		
	}
}

class Savings extends BankAccount{
	double Fixed_Deposits;
	public Savings(String AccName,double Fixed_Deposits){
		super(AccName);
		this.Fixed_Deposits = Fixed_Deposits;
	}
	public double Cash() {
		return Fixed_Deposits;
	}
}

class Current extends BankAccount{
	double cash_credit;
	public Current(String AccName,double cash_credit){
		super(AccName);
		this.cash_credit = cash_credit;
	}
	public double Cash() {
		return cash_credit;
	}
}

