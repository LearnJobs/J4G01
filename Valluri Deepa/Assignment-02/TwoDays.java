import java.time.LocalDate;

public class TwoDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate date1 = LocalDate.now();
		System.out.println("Current date is :" + date1);
		LocalDate date = LocalDate.now().plusDays(2);
		System.out.println("After 2 days date is: " + date + " , "
				+ date.getDayOfWeek());

	}

}
