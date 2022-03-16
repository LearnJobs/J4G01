package Assigmnent1;

public class Average {
	
	private static void intAverage(int[] intArray) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int arrayAverage :intArray) {
			sum=sum+arrayAverage;
		}
		System.out.println("Sum of an integer array ="+sum);
		System.out.println("Average of an Integer Array ="+sum/intArray.length);		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] intArray = {20,15,17,18,19};
		intAverage(intArray);

	}
}
