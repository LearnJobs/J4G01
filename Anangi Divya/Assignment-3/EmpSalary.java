package Carry;

import java.util.InputMismatchException;

public class EmpSalary 
{
	    public static void main(String[] args) {

	        
	        try {
	            System.out.print("Enter Employee salary is: ");
	     EmpSalary t=new EmpSalary();
	            int EmpSalary=9000;
				if( EmpSalary>8000 )
	                throw new Exception("The employee salary must be greater");
	        }
	        catch(InputMismatchException Exception) 
	        {
	            System.out.println("Invalid Employee salary");
	        }
	        catch(Exception exc) {
	            System.out.println(exc.getMessage());
	        }	
}
}