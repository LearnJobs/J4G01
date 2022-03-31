

public class Question_01 
{
    public static void main(String[] args) 
	{
		int n1=10,n2=0,div,add;
		
		try {
			div=n1/n2;
			System.out.println("Division :"+div);
			}
		    
		catch(ArithmeticException e) {
			System.out.println("Division is possible with Zero");
		}
		add = n1 + n2 ;
		System.out.println("Addition :" +add);
	}

}