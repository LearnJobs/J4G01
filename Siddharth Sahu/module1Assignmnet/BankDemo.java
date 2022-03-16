package com.module1Assignmnet;

public class BankDemo {

    public static void main(String[] args) {
		
		BankAccount bankAccount1 = new BankAccount(1,"siddharth",1000);
		BankAccount bankAccount2 = new BankAccount(2,"yashwant",2000);
		BankAccount bankAccount3 = new BankAccount(3,"ashish",1500);
		
	bankAccount1.deposit(500);
	bankAccount3.withDraw(700);
	bankAccount2.deposit(900);
	bankAccount3.deposit(100);
	bankAccount2.withDraw(1000);
	
	System.out.println(bankAccount1);
	System.out.println(bankAccount2);
	System.out.println(bankAccount3);
	bankAccount1.displayAmount();
		
		

	}

}
