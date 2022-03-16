package com.module2assignment;
//Find the age of Employee till now from his date of birth i.e. 6th April 1990


import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Problem_7 {

	public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate empDob = LocalDate.of(1990, Month.APRIL, 6);
		
		int age = Period.between(empDob,today).getYears();
		System.out.println("Age of employee is : "+age);
	}

}