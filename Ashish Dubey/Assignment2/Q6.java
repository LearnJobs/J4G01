package Assignment2;

import java.time.LocalDate;
import java.time.Period;

public class Q6 
{
	public static void main(String args[])
	{
		LocalDate date = LocalDate.now();
		LocalDate date1 = LocalDate.of(1990,04,06);
		System.out.println(date1);
		
		int year= Period.between(date1, date).getYears();
		System.out.println("age :"+year);
		
	}

}

