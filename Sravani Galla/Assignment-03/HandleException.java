package Assignment3;

public class HandleException {

	public static void main(String[] args) {
		try {
		int a[] = new int[5];
		a[5] = 10/0;
	}
	catch(ArithmeticException e) {
		System.out.println("task is finish");
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("commontask finish");
		
		
	}
	System.out.println("rest of code...");
}

	
	// TODO Auto-generated method stub

}


