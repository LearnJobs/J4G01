//Program 08 : Program to add 2 days in current date & check it is sunday oe not

package assignment02;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class AddTwoDays {

	public static void main(String[] args) {
		LocalDate plusTwoDays = LocalDate.now().plusDays(2);
		if(plusTwoDays.getDayOfWeek()==DayOfWeek.SUNDAY)
			System.out.println("It is Sunday");
		else
			System.out.println(plusTwoDays.getDayOfWeek().toString());	 
	}
}
