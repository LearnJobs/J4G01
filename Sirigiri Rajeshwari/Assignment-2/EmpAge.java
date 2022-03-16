import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class EmpAge {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate Birthday = LocalDate.of(1990, Month.APRIL, 06);
		Period p = Period.between(Birthday, today);
		System.out.println("Now Age of employee :"+p.getYears());

		}

}
