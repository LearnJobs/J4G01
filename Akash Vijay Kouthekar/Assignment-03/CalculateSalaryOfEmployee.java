// Program 03 : Program to calculate Salary of Employee. The program should throw
//				salary Exception. If the salary of employee is greater than 80000.
//				Hint : Create your own exception SalaryException class

package assignment03;
public class CalculateSalaryOfEmployee {

	public static void main(String[] args)  {
		double empSalary=80000;
		if(empSalary>80000) {
			
			//Below line will throw salaryException if condition becomes true
			// We can handle this Exception either by using try-catch block or by
			// using throws keyword.
			// We are using try-catch block to handle this exception
				try {
					throw new SalaryException();
					}
				catch(SalaryException salaryException){
					System.err.print("Salary must be less than 80000 Rs");
				}
			}
		else
		{
			empSalary += 5000;
			System.out.println("Employee salary : "+empSalary);
		}
	}
}
