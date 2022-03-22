package com.string;
import java.time.LocalDate;
import java.time.Month;
public class BirthdayOfEmployee {
	public static void main(String[]args)
	 {
		LocalDate today = LocalDate.now();
		
		LocalDate specifiedDate = LocalDate.of(1999, Month.APRIL, 30);

		System.out.println(specifiedDate);


	}


}
