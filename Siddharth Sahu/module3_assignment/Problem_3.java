package com.module3_assignment;
/*Write a program to calculate the salary of Employee. The program should throw
      SalaryException if the salary of employee is more than 80000. (Hint. Create your own
      exception SalaryException)
*/
public class Problem_3 {

	public static void main(String[] args) {
		int[] employeeSalary = { 5000, 40000, 80000, 85000, 8700 };
		EmployeeSalary(employeeSalary);
	}

	private static void EmployeeSalary(int[] employeeSalary) {
		for (int empSal : employeeSalary) {
			if (empSal > 80000) {
				try {
					throw new SalaryException();

				} catch (SalaryException salaryException) {
					System.out.println(salaryException.getMessage());
				}
			} else
				System.out.println("Salary is less than 80000 that is " + empSal);
		}
	}
}

//public class Problem_3 {
//	public static void main(String[] args) {
//		EmployeeSalary(80001);
//
//	}
//
//	private static void EmployeeSalary(int employeeSalary) {
//		if(employeeSalary > 80000)
//			try {throw new SalaryException();}
//		catch (SalaryException se) {
//			System.out.println(se.getMessage());
//		}
//		
//	}
//
//}
