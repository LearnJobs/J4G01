

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Question_07 
{
public static void main(String[] args) {
		
		LocalDate today = LocalDate.now();
		LocalDate empDob = LocalDate.of(1990, Month.APRIL, 6);
		
		int age = Period.between(empDob,today).getYears();
		System.out.println("Employee age from his birthday is: "+age);
	}

}
