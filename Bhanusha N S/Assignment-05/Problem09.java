package com.assigment05;

import java.util.ArrayList;

public class Problem09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arraylist = new ArrayList<Integer>();
		arraylist.add(10);
		arraylist.add(276);
		arraylist.add(32);
		arraylist.add(4);
		arraylist.add(5);
		arraylist.add(6);
		arraylist.add(7);
		arraylist.add(82);
		arraylist.add(9);
		arraylist.add(10);
		int num =arraylist.stream().filter(n->n>20).findFirst().get();
		System.out.println(num);

	}

}
