package com.assignment05;

public class ThreadDemo2 implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 t2 = new ThreadDemo2();
		Thread thread = new Thread(t2);
		thread.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

	}

}
