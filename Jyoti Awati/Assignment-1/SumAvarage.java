
public class SumAvarage {
	public static void main(String[] args) {
		int[] array = new int[] {10, 20, 30, 40};
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		
		System.out.println("Sum Of Numbers :"+sum);
		int avarage =sum/array.length;
		System.out.println("The avarage of numbers :"+avarage);
		}

}
