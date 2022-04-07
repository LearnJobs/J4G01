
import java.time.LocalDate;

public class Add2Days {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("current date:" +date);
		LocalDate date1 = LocalDate.now().plusDays(2);
		System.out.println("After 2 days :"+date+", "+date.getDayOfWeek());
		}

}
