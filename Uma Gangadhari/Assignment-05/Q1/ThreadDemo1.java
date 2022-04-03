package com.assignment05;

public class ThreadDemo1 extends Thread {

	public void run() {
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo1 t1 = new ThreadDemo1();
		t1.start();

	}

}
