package com.assignment05;

import java.util.ArrayList;

public class Q6 {
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Appu");
		nameList.add("Mandar");
		nameList.add("Ajay");
		nameList.add("Nirmala");
		nameList.add("Shanmuk");
		nameList.add("Mounika");
		nameList.add("Madhu");
		nameList.add("Uma");
		nameList.add("Sapna");
		nameList.add("Madhuri");
		nameList.add("Kunal");
		nameList.add("Jaipal");
		nameList.add("Prabhas");
		nameList.add("Vijay");
		nameList.add("Sidharth");
		nameList.add("Suman");
		nameList.add("Mani");
		nameList.add("Vishwas");
		nameList.add("Kanishk");
		nameList.add("Pavani");

		nameList.stream()
		        .filter(x -> x.startsWith("M"))
		        .forEach(System.out::println);

	}

}
