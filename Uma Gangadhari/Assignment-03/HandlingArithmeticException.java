package com.assignment03;

public class HandlingArithmeticException {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int num1, num2, add, sub, div, mul;
			num1 = 10;
			num2 = 0;
			add = num1 + num2;
			System.out.println("Addition:" + add);
			sub = num1 - num2;
			System.out.println("Subtraction:" + sub);
			try {
				div = num1 / num2;
				System.out.println("Division:" + div);
			}catch(ArithmeticException arthematicException) {
			System.out.println("Can not divide by zero");
			}
			
			mul = num1 * num2;
			System.out.println("Multiplication:" + mul);
		}
	}


