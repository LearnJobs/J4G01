

public class Question_02 {

	public static void main(String[] args)
	{
		try 
		{
			
			int[] arr = { 72, 83, 93 };
			System.out.println(arr[30]); // it gives exception because size of array is exceeded
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("ArrayIndexOutOfBound Exception Presented");
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Presented");
		}
		catch (Exception e) 
		{
			System.out.println("Default Exception Present");
		}
	}

}