package Assignment2;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Q8 
    {

		public static void main(String[] args) {
			
			LocalDate date1 = LocalDate.now();
			LocalDate date2 = date1.plusDays(2);
			
			System.out.println(date1);
			System.out.println(date2);

			if(date2.getDayOfWeek().equals( DayOfWeek.SUNDAY ) )
				System.out.println("It's a Sunday");
			else
				System.out.println("It's not a Sunday");
		}

	}
				
		

	


