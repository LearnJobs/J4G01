
public class AdditioAndAverageOfIntegerArray 
{

	public static void main(String[] args)
	{
		int[] intArray= {10,30,20,40,50};
		sumofArrayElementAndAverage(intArray);

	}

	private static void sumofArrayElementAndAverage(int[] integerArray) 
	{
		int sum=0;
		for(int value:integerArray)
		
			sum+=value;
		
		System.out.println("Sum of array element:"+sum);
		System.out.println("Average of array element:"+(sum/integerArray.length));

	}

}
