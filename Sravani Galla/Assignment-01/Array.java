package module;

public class Array {
	public static void main(String[]args) {
		int[] arr = new int [5];
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		arr[0] = 11 ;
		arr[1] = 12 ;
		arr[2] = 113 ;
		arr[3] = 14 ;
		arr[4] = 15 ;
		for(int i = 1;i<arr.length;i++) {
		  System.out.println(arr[i]);
		}
		for(int x:arr) {
			System.out.println(x);
		}
		
	}

}
