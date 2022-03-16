package com.assignments02;
//program 01 main method
public class Main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods method = new Methods("Dog", "Dog");
		boolean x = method.equals(method);
		System.out.println("equal() : " + x);
		System.out.println("compareTo() : " + method.compareTo("cat"));
		System.out.println("endsWith() : " + method.endsWith("g"));
		System.out.println("equalsIgnorecase() : "
				+ method.equalsIgnoreCase("cat"));
		System.out.println("starstsWith() : " + method.startsWith("s"));

	}

}
