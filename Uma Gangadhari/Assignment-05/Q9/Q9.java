package com.assignment05;

import java.util.ArrayList;

public class Q9 {
	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(2);
		number.add(31);
		number.add(9);
		number.add(11);
		number.add(14);
		number.add(21);
		number.add(66);
		number.add(37);
		number.add(41);
		
		int firstNumber =number.stream()
				               .filter(n->n>20)
				               .findFirst()
				               .get();
		System.out.println(firstNumber);
	}

}