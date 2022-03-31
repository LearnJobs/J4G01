package Assignment3;

public class MultipleExceptionHandle {
	
	public static void main(String[] args) {
			
		int no1=10;
		int no2=5;
		int div;
		int [] array=new int[1];
		try{
			
			div=no1/no2;
			System.out.println("Division:"+div);
			
			array[0]=1;
			array[1]=2;
			System.out.println(array);
		}
		catch(ArithmeticException e){
			System.out.println("Exception:"+e);
		}
		catch(ArrayIndexOutOfBoundsException abe){
			System.out.println("Exception:"+abe);
		}
	}

}
