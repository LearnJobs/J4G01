package com.assignments01;

import java.util.Scanner;

public class MyAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int amt = 0;
		BankAccount bankaccount = new BankAccount(07, "Bhanusha");
		bankaccount.displayDetails();
		bankaccount.deposite(1000);
		System.out.println("Enter the AMOUNT:");
		amt = s.nextInt();
		if (amt <= 0) {
			System.out.println("INVALID AMOUNT");

		} else
			bankaccount.withdraw(amt);

	}

}
