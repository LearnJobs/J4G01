package com.string;

public class StringCompare {
	public static void main(String[]args) {
		String str1 = new String("Hello");
		String str2 = new String("Hii");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.endsWith(str2));
		System.out.println(str1.startsWith(str2));

	}

}
