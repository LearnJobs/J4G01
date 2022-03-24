package com.assignment03;

public class CalcSalary {
	   public static void main(String[] args) {
		   double salary[] = {10000, 20000,30000,80000,85000};
		   for(double sal : salary) {
			   try {
				   if(sal > 80000) {
					   throw new SalaryException("salary>80000");
				   }else {
					   System.out.println(sal + "is valid salary");
				   }
			   }catch (SalaryException e) {
				   System.out.println(" salary is more than ceiling :"+e.getMessage());
			   }
		   }
	   }
	}