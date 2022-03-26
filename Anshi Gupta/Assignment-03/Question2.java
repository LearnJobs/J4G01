package assignment3;

public class Question2 {
	public static void main(String[] args)
	{
		int[] arr= {30};
		int div;
//		div=arr[0]/arr[1];
		try
		{
			div=arr[0]/arr[1];
			System.out.print("division is"+div);
		}	
//		catch(Exception e)
//		{
//			if(e instanceof ArithmeticException)
//				System.out.print("cannot divide by 0");
//			
//			if(e instanceof ArrayIndexOutOfBoundsException)
//				System.out.print("It Does not Exist");
//		}
		catch(ArithmeticException e){
		 System.out.print("cannot divide by 0");

		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.print("It Does not Exist");

			
		}
		catch(Exception e3)
		{
			
		}
	}
}
