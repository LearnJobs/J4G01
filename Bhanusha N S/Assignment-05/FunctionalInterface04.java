package com.assigment05;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Problem 04
 *
 */
public class FunctionalInterface04 {

	public static void main(String[] args) {
		ArrayList<Integer> arralist = new ArrayList<Integer>();
		for (int i = 1; i <= 10; i++)
			arralist.add(i);
		Consumer<Integer> square = (n) -> System.out.println(n * n + " ");
		System.out.println("squares");
		for (Integer num : arralist)
			square.accept(num);
	}

}
