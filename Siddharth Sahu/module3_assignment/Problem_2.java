package com.module3_assignment;
//Write a program to show how to handle the exception generically(The try block can
//      have more than one exception

public class Problem_2 {

	public static void main(String[] args) {
		int[] number = { 10 };
		int div;

		try {
			div = number[0] / number[1];
			System.out.println("division of " + number[0] + " and " + number[1] + " is " + div);
		} catch (ArithmeticException arithmeticException) {
			System.out.println("Cannot divide by zero");
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("Enter two numbers atleast");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
