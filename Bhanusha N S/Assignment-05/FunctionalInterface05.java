package com.assigment05;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FunctionalInterface05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(3);
		arraylist.add(4);
		arraylist.add(5);
		arraylist.add(6);
		arraylist.add(7);
		arraylist.add(8);
		arraylist.add(9);
		arraylist.add(10);
		Predicate<Integer> odd_numbers = n -> n % 2 != 0;
		System.out.println("Odd Numbers");
		for (Integer num : arraylist)
			if (odd_numbers.test(num))
				System.out.println(num + " ");

	}

}
