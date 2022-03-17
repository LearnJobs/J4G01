
public class MulExceptions {

	public static void main(String[] args) {
		
				int[] integerArray = {20,10};
				int num1,num2;
				
				try 
				{
					num1 = integerArray[0]/integerArray[1];		
					System.out.println("First Division : "+num1);
				
					num2 = integerArray[1]/integerArray[2];		
					System.out.println("Second Division : "+num2);
				}
				catch(ArithmeticException e)
				{
					System.out.print("Cannot be divided by zero");
				}
				catch(ArrayIndexOutOfBoundsException e)
				{
					System.out.print("OutOfIndexBoundException");
				}
			}
		

	

}
