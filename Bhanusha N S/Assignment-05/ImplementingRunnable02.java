package com.Assignment05;

/**
 * 01.Create a thread to print Hello world by implementing runnable interface
 * 
 */
public class ImplementingRunnable02 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementingRunnable02 implementrunnable = new ImplementingRunnable02();
		Thread t = new Thread(implementrunnable);
		t.start();
		t.setName("Hello world..!!");

	}
}
