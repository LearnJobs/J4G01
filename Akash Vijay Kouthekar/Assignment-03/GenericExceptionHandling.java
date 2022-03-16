// Program 02 : Program to Handle Exception Handling generically & try block
//				should throw more than one exception

package assignment03;
public class GenericExceptionHandling {

	public static void main(String[] args) {
		int[] integerArray = {10,2};
		int division1,division2;
		
		try 
		{
			division1 = integerArray[0]/integerArray[1];		// It will throw ArithmeticException if second element is 0
			System.out.println("First Division : "+division1);
		
			division2 = integerArray[1]/integerArray[2];		// It will throw ArrayIndexOutOfBoundsException if next element is not available
			System.out.println("Second Division : "+division2);
		}
		catch(ArithmeticException e)
		{
			System.err.print("Cannot be divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.print("No next Element available for second division");
		}
	}
}
