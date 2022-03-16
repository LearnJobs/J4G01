import java.time.DayOfWeek;
import java.time.LocalDate;

public class AddngTwoDaysToCurrentDate {
	 public static void main(String[] args)
	    {        
	        LocalDate localDate= LocalDate.now(); 
	        System.out.println("Today's Date:"+localDate);
	        LocalDate localDate1= localDate.plusDays(2);  
	        System.out.println("After adding 2 days:"+localDate1);         
	        DayOfWeek dayOfWeek= DayOfWeek.from(localDate1);          
	                  int value = dayOfWeek.getValue();                  
	                  System.out.println(dayOfWeek.name()+ "="+value);
	        if(value==0)
	        	 System.out.println("Sunday");
	        else
	        	System.out.println("Not Sunday");
	    }
	}

