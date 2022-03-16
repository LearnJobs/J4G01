package com.module3_assignment;
// Write a program to show how to handle ArithmeticException
public class Problem_1 {

	public static void main(String[] args) {
		int [] number= {10,0};
		int div;
		
		try {
		div = number [0]/ number[1];
		System.out.println("division of "+number[0]+" and "+number[1]+" is "+div);
		}catch(ArithmeticException arithmeticException) {
			System.out.println("Cannot divide by zero");
		}

	}

}
