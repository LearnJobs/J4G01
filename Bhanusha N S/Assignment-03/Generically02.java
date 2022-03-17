package com.assignment3;

public class Generically02 {
	public void generic(int a, int b, String word){
		try{
		double c=a/b;
		System.out.println("value of c: "+c);
		String x=word.substring(5);
		System.out.println("value of x: "+x);
	}
		catch(ArithmeticException e){
			System.out.println("EXCEPTION OCCURED");
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("EXCEPTION OCCURED");
		}
	}
}
