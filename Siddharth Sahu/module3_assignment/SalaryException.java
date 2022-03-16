package com.module3_assignment;
/*Write a program to calculate the salary of Employee. The program should throw
      SalaryException if the salary of employee is more than 80000. (Hint. Create your own
      exception SalaryException)
*/
public class SalaryException extends Exception {

	public String getMessage() {
		return "Salary is more than 80000 exception occured";

	}

}
