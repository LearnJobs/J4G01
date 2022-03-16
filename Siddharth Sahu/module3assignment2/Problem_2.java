//Write a program to create a HashMap of with atleast 10 key value pairs

package com.module3assignment2;

import java.util.HashMap;
import java.util.Map.Entry;

public class Problem_2 {

	public static void main(String[] args) {

		HashMap<Integer, String> book1 = new HashMap<Integer, String>();
		book1.put(1, "Java");
		book1.put(2, "Python");
		book1.put(3, "C#");
		book1.put(4, "HTML");
		book1.put(5, "JavaScript");
		book1.put(6, "Ruby");
		book1.put(7, "C++");
		book1.put(8, "C");
		book1.put(9, "CSS");
		book1.put(10, "Java");
		book1.put(10, "Swift"); // duplicate key
		book1.put(11, "Java"); // duplicate value

		for (Entry<Integer, String> entry : book1.entrySet())
			System.out.println(entry);

	}

}
