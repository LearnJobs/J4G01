
public class ExampleTryCatch 
{

	public static void main(String[] args) 
	{
		int num1,num2;
		try
		{
			num1 = 0;
			num2 = 62/num1;
			System.out.println(num2);
			System.out.println("Hey I'm at the end of try block");
		}
		catch(Exception e)
		{
			System.out.println("You should not divide a number by zero");
		}
		System.out.println("I'm out of try-catch block in java");
					
		}

	}


