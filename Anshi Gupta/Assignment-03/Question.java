package assignment3;

public class Question {
	public static void main(String[] args)
	{
		int num1=40, num=0, div;

	try
	{
		div=num1/num;
		System.out.println("Division is="+div);
	}
	catch(ArithmeticException e)
	{
//		System.out.print("Cannot Divide with 0 \n");
		System.err.println("Cannot Divide with 0");
	}
	}

}
