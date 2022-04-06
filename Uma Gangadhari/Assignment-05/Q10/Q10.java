package com.assignment05;
import java.util.ArrayList;


public class Q10 {
	public static void main(String[] args)

	{
		ArrayList<String> List = new ArrayList<String>();
		
		List.add("nice");
		List.add("fate");
		List.add("apte");
		List.add("enter");
		List.add("java");

		boolean match = List.stream()
				            .anyMatch(s -> s.endsWith("te"));
		System.out.println(match);

	}
}
