package com.Assignment05;

//01.Create a thread to print Hello world extending thread class

public class ExtendThread01 extends Thread {
	public ExtendThread01() {

	}

	public void run() {
		System.out.println("Hello world..!!");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendThread01 threadclass = new ExtendThread01();
		threadclass.start();
	}

}
