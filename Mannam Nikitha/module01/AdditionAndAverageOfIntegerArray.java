package assignment01;

public class AdditionAndAverageOfIntegerArray {
	public static void main(String[] args){
		int[] intArray = {10,20,30,40,50};
		sumOfArrayElementAndAverage(intArray);		
	}
	public static void sumOfArrayElementAndAverage(int[] integerArray){
		int sum=0;
		for(int value:integerArray)
			sum+=value;
		System.out.println("Sum of array element : "+sum);
		System.out.println("Average of array element : "+(sum/integerArray.length));
	}
}
