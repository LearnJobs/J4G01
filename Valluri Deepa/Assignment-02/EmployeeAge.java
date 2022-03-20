import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class EmployeeAge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate today = LocalDate.now();
		LocalDate bornday = LocalDate.of(1990, Month.APRIL, 06);
		Period p = Period.between(bornday, today);
		System.out.println("Age of the employee is:" + p.getYears());

	}

}
