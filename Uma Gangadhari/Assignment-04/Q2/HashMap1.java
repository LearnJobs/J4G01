package com.assignment04;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> names = new HashMap<Integer, String>();
		names.put(1, "Uma");
		names.put(2, "Mouni");
		names.put(3, "Appu");
		names.put(4, "Bhagya");
		names.put(5, "Nag");
		names.put(6, "Soundarya");
		names.put(7, "Vinee");
		names.put(8, "Ramya");
		names.put(9, "Mouni");
		names.put(10, "Jaanu");

		/*
		 * System.out.println(names);
		 * 
		 * System.out.println(names.get(1));
		 * 
		 * System.out.println(names.entrySet());
		 * 
		 * for (String names1 : names.values()) System.out.println(names1);
		 */

		for (Entry<Integer, String> names3 : names.entrySet())

		{
			System.out.println(names3);
		}

	}

}
