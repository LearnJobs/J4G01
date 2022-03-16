package com.assignments02;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 * 08. program to add 2days in the current date also check if it is sunday or
 * not?
 * 
 */
public class AddTwoDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date is :" + date1);
		LocalDate date = LocalDate.now().plusDays(2);
		System.out.println("After 2 days date is: " + date + " , "
				+ date.getDayOfWeek());

	}

}