package Assignment3;

public class Q2 {

	public static void main(String[] args) {
		try { // because in myMarks Array indec[10] not available.
			int[] myMarks = { 72, 83, 93 };
			System.out.println(myMarks[10]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBound Exception Occurs");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception Occurs");
		} catch (Exception e) // generic way to handling Exceptions.
		{
			System.out.println("Parent Exception Occurs");
		}
	}

}
