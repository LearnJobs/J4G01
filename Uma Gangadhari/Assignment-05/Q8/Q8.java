package com.assignment05;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Q8 {
	public static void main(String[] args) {
		ArrayList<Integer> numbersList = new ArrayList<Integer>();
		numbersList.add(2);
		numbersList.add(1);
		numbersList.add(1);
		numbersList.add(3);
		numbersList.add(1);
		numbersList.add(1);
		numbersList.add(9);
		numbersList.add(9);
		numbersList.add(8);		
		
		ArrayList<Integer> squareNumbers = (ArrayList<Integer>) numbersList.stream()
																		   .map(n->n*n)
																		   .collect(Collectors.toList());
		  squareNumbers.forEach(System.out::println);
		
	}
}
