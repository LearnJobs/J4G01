package com.assignments02;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 * 07.Age Calculated from date of birth given 06-04-1990
 * 
 */
public class AgeCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate bornday = LocalDate.of(1990, Month.APRIL, 06);
		Period p = Period.between(bornday, today);
		System.out.println("Age of the employee is:" + p.getYears());
	}

}
