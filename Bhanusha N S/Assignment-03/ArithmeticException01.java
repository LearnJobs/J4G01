package com.assignment3;

public class ArithmeticException01 {
	public void div(int a,int b){
		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("EXCEPTION OCCURED");
		}
		}
	public void add(int a,int b){
		int c=a+b;
		System.out.println(c);
			
		}
}
