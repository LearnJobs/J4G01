package com.assignment04;

import java.util.TreeSet;

public class StdCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("Gangadhari", "Uma");
		Student s2 = new Student("Gangadari", "Mounika");
		Student s3 = new Student("Ponugoti", "Appu");
		Student s4 = new Student("Gangadhari", "Uma");

		TreeSet<Student> nameSet = new TreeSet<Student>();
		nameSet.add(s1);
		nameSet.add(s2);
		nameSet.add(s3);
		nameSet.add(s4);

		// System.out.println(nameSet);

		for (Student s : nameSet) {
			System.out.println(s);
		}

	}
}
