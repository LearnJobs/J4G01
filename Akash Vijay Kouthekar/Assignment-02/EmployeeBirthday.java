// Program 06 : Create a class to initiate birthday of employee as 6th April 1990
// Program 07 : To get current age of employee from his date of birth

package assignment02;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
public class EmployeeBirthday {

	public static void main(String[] args) {
		LocalDate employeeBirthday = LocalDate.of(1990, Month.APRIL,6);
		LocalDate currentDate = LocalDate.now();
		Period age = Period.between(employeeBirthday, currentDate);
		System.out.println("Employee age is "+age.getYears()+" years "+age.getMonths()+" months "+age.getDays()+" days");
	}
}
