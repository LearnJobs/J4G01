package Assignment3;

public class SalaryException extends Exception{
	public String msg() {
		  return "Salary is greater than 8000";
	}
}