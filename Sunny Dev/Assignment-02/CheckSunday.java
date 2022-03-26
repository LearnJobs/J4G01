
	import java.time.DayOfWeek;
	import java.time.LocalDate;
	import java.time.temporal.ChronoField;

	public class CheckSunday
	{
	    public static void main(final String[] args)
	    {
	         LocalDate date1 = LocalDate.now();

	        LocalDate date2 = date1.plusDays(1); 
	        
	       String s=date2.getDayOfWeek().toString();
	       if(s.equalsIgnoreCase("SUNDAY"))
	       {
	    	 System.out.println("Yes Sunday");
	    	 
	    }
	       else
	       {
	    	   System.out.println("Not Sunday");
	       }

	    }
	}


