
public class ExcepetionGenerically {
	public static void main(String args[])
	{
		int[] integerArray = {55};
		int div_1,div_2;
		
		try 
		{
			div_1 = integerArray[0]/integerArray[1];		
			System.out.println("First Division : "+div_1);
		
			div_2 = integerArray[1]/integerArray[2];		
			System.out.println("Second Division : "+div_2);
		}
		catch(ArithmeticException e)
		{
			System.err.print("Can't be divided by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.err.print("No next Element available for second division");
		}
	}

}


