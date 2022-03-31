package com.Assignment05;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * question no-03
 *
 */
public class Main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ExecutorService service = Executors.newSingleThreadExecutor();	
		 service.execute(new Executorsframeworks());
	}

}
