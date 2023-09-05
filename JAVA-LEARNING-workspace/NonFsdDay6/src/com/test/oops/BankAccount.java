package com.test.oops;

public class BankAccount {



	private Long accountNumber;

	private String accountHolderName;

	private Long balance;

	public BankAccount(Long accountNumber, String accountHolderName, Long balance) {

		this.accountNumber = accountNumber;

		this.accountHolderName = accountHolderName;

		this.balance = balance;

	}

	public Long getAccountNumber() {

		return accountNumber;

	}

	public void setAccountNumber(Long accountNumber) {

		this.accountNumber = accountNumber;

	}

	public String getAccountHolderName() {

		return accountHolderName;

	}

	public void setAccountHolderName(String accountHolderName) {

		this.accountHolderName = accountHolderName;

	}

	public Long getBalance() {

		return balance;

	}

	public void setBalance(Long balance) {

		this.balance = balance;

	}

	public Long deposit(Long amount) {

		balance = balance + amount;

		System.out.println(
				"The amount has been credited to account number" + accountNumber + "\nThe balance amount is ");

		return balance;

	}

	public Long withdrawal(Long amount) {
		balance = balance - amount;

		System.out.println(
				"The amount has been debited from account number " + accountNumber + "\nThe balance amount is ");

		return balance;
	}

	public void showBalance() {

		System.out.println("Account number : " + accountNumber +

				"\nName : " + accountHolderName +

				"\nBalance : " + balance);
	}

	public static void main(String[] args) {

		BankAccount n1 = new BankAccount(1234567890l, "shyam", 10000l);

		long a = 5000l;

		System.out.println(n1.withdrawal(a));

		System.out.println(n1.deposit(a));

        n1.showBalance();
	
	}
}

