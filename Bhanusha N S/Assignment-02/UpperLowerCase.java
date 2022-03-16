package com.assignments02;

/**
 * 03.convert the given String to uppercase and lowercase
 * 
 */
public class UpperLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Bhanusha";
		String[] upper = name.split("is");
		for (String uppercase : upper)

			System.out.println("Uppercase: " + uppercase.toUpperCase());
		for (String lowercase : upper)

			System.out.println("Lowercase: " + lowercase.toLowerCase());

	}

}
