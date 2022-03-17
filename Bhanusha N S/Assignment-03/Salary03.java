package com.assignment3;

class OwnException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OwnException(String s) {

		super(s);
	}
}

public class Salary03 {
	void salaryCheck(int salary) throws OwnException {
		if (salary >= 80000) {
			throw new OwnException("SalaryException");
		} else {
			System.out.println("your salary is : " + salary);
		}
	}

	public static void main(String args[]) {
		Salary03 salary = new Salary03();
		try {
			salary.salaryCheck(80000);
		} catch (OwnException e) {
			System.out.println("exception occured");
			System.out.println(e.getMessage());
		}
	}
}
