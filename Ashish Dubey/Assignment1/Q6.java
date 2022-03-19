package Assignment1;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		int a[], sum = 0, product = 1, average, num;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of array elements:");
		num = in.nextInt();
		a = new int[num];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < num; i++) {
			System.out.println("Enter the " + (i + 1) + " element:");
			a[i] = in.nextInt();
		}
		for (int i = 0; i < num; i++) {
			sum = sum + a[i];
			product = product * a[i];
		}
		average = sum / num;
		System.out.println("Sum of array elements is: " + sum);
		System.out.println("Product of array elements is: " + product);
		System.out.println("Average of array elements is: " + average);
	}
}
