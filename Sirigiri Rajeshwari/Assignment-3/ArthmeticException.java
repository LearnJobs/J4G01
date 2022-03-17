
// ArthmeticException (Module-3.1)
// Try block can have more than one Exception (Module - 3.2)

public class ArthmeticException {

	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		try {
			double d = i/j;
			System.out.println(d);
			int n = Integer.parseInt("20x");
			System.out.println(n);
		
		}
		catch(SalaryException e) {
			System.out.println("NumberFormateException :"+e.getMessage());
		}
		catch(ClassCastException e) {
			System.out.println("ClassCastException");
		}	
		catch(ArithmeticException e) {
		    System.out.println("ArithmeticException :"+e.getMessage());	
		}
		try {
			System.out.println("Second try block");
		}finally {
			System.out.println("This is finally block");
		}
		
	}
}
