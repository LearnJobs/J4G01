package com.module1Assignmnet;
/*Create a BankAccount class with the members accountId, accountName, accountBalance.
 *  Add the deposit() and withdraw() method which takes the amount as an argument. 
 *  The BankAccount should also consist of one variable which can store the sum of
 *  the balance of all the objects. Create 3 such objects, invoke deposit() and 
 *  withdraw randomly and display the details of all the accounts and total balance
 *  available in the bank.
*/
public class BankAccount {

	int accountId;
	double accountBalance;
	static double totalAmount = 0;
	String accountName;

	public BankAccount(int accountId, String accountName, double accountBalance) {
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountBalance = accountBalance;
		totalAmount+=accountBalance;
	}

	public void displayAmount() {
		System.out.println("Total amount in bank is " + totalAmount);
	}

	public void withDraw(double amount) {
		if (amount > 0) {
			accountBalance += amount;
			totalAmount += amount;
			System.out.println("Amount deposited Rs " + amount);
		} else
			System.out.println("Amount can't be deposited");
	}

	public void deposit(double amount) {
		if (amount <= accountBalance) {
			accountBalance -= amount;
			totalAmount -= amount;
			System.out.println("Amount withdrawn Rs " + amount);
		} else
			System.out.println("Insufficient balance.");
	}

	public String toString() {
		return "Account Number : " + accountId + ", Name : " + accountName + ", Total Amount : " + accountBalance;

	}

}
