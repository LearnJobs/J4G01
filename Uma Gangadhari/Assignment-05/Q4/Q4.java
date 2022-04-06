package com.assignment05;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Q4 {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		
		for (int i = 1; i <= 10; i++)
				numbersList.add(i);

		System.out.println("Printing square of numbers from 1 to 10 by Consumer");
		Consumer<Integer> squareNumbers = (n) -> System.out.print(n * n + " ");
		for (Integer number : numbersList)
			squareNumbers.accept(number);
	}
}