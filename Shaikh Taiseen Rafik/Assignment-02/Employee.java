// Question 6, 7,8.
package Assignment2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Employee {	

	public static void main(String[] args) {
		
		LocalDate birthday = LocalDate.of(1990,Month.APRIL, 06);
		System.out.println("Initiated bithday date :=> "+birthday);
		LocalDate todayDate = LocalDate.now();
		
		Period age =Period.between(birthday,todayDate);
		System.out.println("Age of Employee :=>"+age.getYears());
		
		LocalDate addDays = LocalDate.now().plusDays(2);
		if(addDays.getDayOfWeek()==DayOfWeek.SUNDAY)
			System.out.println("Sunday");
		else
			System.out.println(addDays.getDayOfWeek().toString());
			
	}

}
