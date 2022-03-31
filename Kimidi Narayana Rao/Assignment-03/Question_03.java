

import java.util.InputMismatchException;

public class Question_03 
{
	    public static void main(String[] args) {

	        
	        try 
	        {
	            int Salary=50000;
	            
				if( Salary>20000 )
					
	             throw new Exception("The Employee salary is highest");
			}
	        
	        catch(InputMismatchException Exception) 
	        {
	            System.out.println("Invalid Employee salary");
	        }
	        catch(Exception e) {
	            System.out.println(e.getMessage());
	        }	
}
}