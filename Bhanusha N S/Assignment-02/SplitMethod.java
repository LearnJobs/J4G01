package com.assignments02;

/**
 * 02.split the given sentence to generate different strings and print the
 * strings separately
 * 
 */
public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentance = "My name is Bhanusha";
		String[] splitMethod = sentance.split("is");
		for (String s : splitMethod)
			System.out.println("split() : " + s);

	}

}
