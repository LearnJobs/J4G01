public class problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			try {
				int a[]= new int[5];
				a[5]=100/0;
				
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
			
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array Index Out Of bound Exception"+e);
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
	

}
