package Assignment3;

public class Q1 
{
    public static void main(String[] args) 
	{
		int number1=20,number2=0,division,addition;
		
		try {
			division=number1/number2;
			System.out.println("Division :"+division);
			}
		    
		catch(ArithmeticException e) {
			System.out.println("can not divid woth zero!!");
		}
		addition = number1 + number2 ;
		System.out.println("Addition : +addition");
	}

}
