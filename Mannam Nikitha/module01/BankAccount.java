package com.assignment01;

public class BankAccount {
	int accountId;
	String accountName;
	double accountBalance;
	double sumBalance;

	public BankAccount(int accountId, String accountName, double accountBalance) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BankAccount ba1 = new BankAccount(1, "nikki", 2000.00);
		ba1.add(500);

		System.out.println("ID:         " + ba1.accountId);
		System.out.println("Name:       " + ba1.accountName);
		System.out.println("Balance:    " + ba1.accountBalance);

		System.out.println();
        ba1.withdraw(500);
		
        System.out.println("ID:         " + ba1.accountId);
		System.out.println("Name:       " + ba1.accountName);
		System.out.println("Balance:    " + ba1.accountBalance);
	}

	public void add(double amt) {
		accountBalance = accountBalance + amt;
	}

	public void withdraw(double amt) {
		accountBalance -= amt;
	}
}