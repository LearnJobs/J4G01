

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Question_08 
    {

		public static void main(String[] args) {
			
			LocalDate date1 = LocalDate.now();
			LocalDate date2 = date1.plusDays(4);
			
			System.out.println(date1);
			System.out.println(date2);

			if(date2.getDayOfWeek().equals( DayOfWeek.SUNDAY ) )
				System.out.println("Day is Sunday");
			else
				System.out.println("Day is not a Sunday");
		}

	}
				
		

	

