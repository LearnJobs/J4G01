package Assignment3;

public class ExceptionHandle {

	public static void main(String[] args) {
		
		int no=10;
		int div;
		try{
			
			div=no/0;
			System.out.println("Division:"+div);
			
		}
		catch(ArithmeticException e){
			System.out.println("Exception:"+e);
		}
	}

}
