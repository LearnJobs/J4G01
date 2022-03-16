package com.module1Assignmnet;

public class CallingName {
	
	public void displayName(String name) {
		System.out.println("My name is "+name);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallingName myName = new CallingName();
		myName.displayName("Siddharth Sahu");
	}
}



//public class CallingName {
//	
//String myName;
//
//public CallingName(String myName) {
//	this.myName =myName;
//}
//
//public void displayName() {
//	System.out.println("My name is "+this.myName);
//}
//
//
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	CallingName myName = new CallingName("Siddharth Sahu");
//	myName.displayName();
//}
//
//
//}