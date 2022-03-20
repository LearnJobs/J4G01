
public class ArithmeticExceptionTest {

	public static void main(String[] args) {
   int a = 2, b = 10;
		int c = 0;
		try {
			c = b / a;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("\n" + "ArithmeticException is handled. But take care of the variable \"c\"");
		}
		System.out.println("Value of c :" + c);
	}
}

