package Carry;

public class TeatMultiple 
{
	public static void main(String[] args)
	{
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("task is finish");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Common task is finish");
		}
		System.out.println("Rest of code....");
	}
}
