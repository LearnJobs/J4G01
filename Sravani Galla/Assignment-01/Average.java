package module;

public class Average {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int sum = 0;
		for(int i = 0; i < numbers.length ; i++) {
			System.out.println("Value of i ="+i);
		
			sum = sum + numbers[i];
			System.out.println("Value of numbers[i]"+numbers[i]);
		System.out.println("sum is:" + sum);
		double average = sum / numbers.length;
		System.out.println("Average value of the array elements is : " + average);


	}
		System.out.println("numbers.length ="+numbers.length);
}
}
