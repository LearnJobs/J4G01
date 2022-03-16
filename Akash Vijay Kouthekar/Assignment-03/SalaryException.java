// This class is part of program no : 03

package assignment03;
public class SalaryException extends Exception{
	@Override
	public String getMessage() {
		  return "Salary is more than 80000 Rs";
	}
}
