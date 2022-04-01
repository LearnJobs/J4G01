
public class arithmeticexception {
	int x=15,y=5;
	public void arithmeticException()
	{
		try {
			int num=x/y;
			System.out.println(num);
		}
		catch(ArithmeticException arthemeticexception) 
		{
			System.out.println("the number not divide by zero");
		}
		
	}
	
	
	public static void main(String args[])
	{
		arithmeticexception aE = new arithmeticexception();
		aE.arithmeticException();
	}

}


