package com.module2assignment;
//   6. Create class to initiate the birthday of Employee as 6th April 1990

import java.time.LocalDate;
import java.time.Month;

public class Problem_6 {

	public static void main(String[] args) {
		
		LocalDate dob = LocalDate.of(1990, Month.APRIL, 6);
		System.out.println("Employee Date of Birth : " + dob);
		
	}
}
