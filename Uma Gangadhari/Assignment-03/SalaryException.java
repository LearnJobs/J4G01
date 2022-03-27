package com.assignment03;

public class SalaryException extends Exception {

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Salary Exception Occured";
	}

	public static void main(String[] args) {
		calculateGrossSalary(80000);
	}

	private static void calculateGrossSalary(int i) {
		// TODO Auto-generated method stub
		if (i > 80000)
			try {
				throw new SalaryException();
			} catch (SalaryException salaryException) {
				System.out.println(salaryException.getMessage());
			}
		else {
			double grossSalary = i + 20000 + 30000;
			System.out.println("GrossSalary:"+grossSalary);
		}

	}
}