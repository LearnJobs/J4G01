package com.assignment03;

public class GenericException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 10 };
		int div;
		try {
			div = numbers[0] / numbers[1];
			System.out.println("Division:" + div);
		} catch (Exception exception) {
			if (exception instanceof ArithmeticException)
				System.out.println("Can not divisible by zero");
			if (exception instanceof ArrayIndexOutOfBoundsException)
				System.out.println("Provide Atleast two Elements In The Array");
		}
	}

}
