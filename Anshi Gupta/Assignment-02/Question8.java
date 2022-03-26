package CompareString;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;


public class Question8
{

	public static void main(String[] args)
	{
		LocalDate date1=LocalDate.now();
		LocalDate date2=date1.plusDays(2);
		System.out.println(date1);
		System.out.println(date2);
		//System.out.println(addDate.getDayOfWeek());
		String s=date2.getDayOfWeek().toString();
		if(s.equalsIgnoreCase("Sunday"))
		{
			System.out.println("today is sunday");
		}
		else
		{
			System.out.println("not sunday");
		}
		
//		if(date2.getDaysOfWeak().equals(DaysOfWeak.SUNDAY)) 
//		{
//			System.out.println("It is Sanday");
//	}
	}

}
