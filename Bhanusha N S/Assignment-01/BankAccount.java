package com.assignments01;

public class BankAccount {

	int accountID;
	String accountName;
	double accountBalance=0;
		public BankAccount(int accountID,String accountName){
		this.accountID=accountID;
		this.accountName=accountName;
		
	}
		public void deposite(int amount){
			this.accountBalance+=amount;
			System.out.println("Balance is: "+accountBalance);
		}
		public void withdraw(int amount){
			if(accountBalance>=amount){
		       double balance=accountBalance-amount;
		       this.accountBalance=balance;
		       System.out.println("Total Balance available in the bank : "+accountBalance);
			}
		}
	public void displayDetails(){
		System.out.println("Account ID: "+this.accountID);
		System.out.println("Account Name: "+this.accountName);
	}
}



