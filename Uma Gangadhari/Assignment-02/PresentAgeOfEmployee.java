import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PresentAgeOfEmployee {
	public static void main(String[] args) {
		
		
		 LocalDate date1=LocalDate.of(1990, Month.APRIL, 6);	
		 System.out.println(date1);
		 
		 LocalDate date2=LocalDate.now();
		 System.out.println(date2);
		 
		 int Age=Period.between(date1,date2).getYears();
		 int Age1=Period.between(date1,date2).getMonths();
		 int Age2=Period.between(date1,date2).getDays();
						 
		 System.out.println(Age+ "Years "+Age1+ "Months "+Age2+ "Days ");	 
		 
	}

}
