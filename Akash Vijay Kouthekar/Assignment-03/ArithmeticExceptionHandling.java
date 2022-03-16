// Program 01 : Program to handle ArithmeticException

package assignment03;
public class ArithmeticExceptionHandling {
	public static void main(String[] args) {
		int number1=10;
		int number2=0;
		int division;
		try
		{
			division = number1/number2;						//This line will raise ArithmeticException
			System.out.println("Division is : "+division);
		}
		catch(ArithmeticException arithmeticException)
		{
			System.err.println("Can't perform division by zero");
			System.out.println("Alternative division is "+(number1/2));
		}
	}
}
