package com.assignment05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExcecutorFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExecutorService executor = Executors.newFixedThreadPool(1);
		executor.execute(new Task());

	}
}

class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

	}

}