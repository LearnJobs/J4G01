package com.module2assignment;
/*problem 2. Split the given sentence to generate different strings and print the strings separately. 
 * (Hint - use the split() method)
*/

public class Problem_2 {
	
	String[] stringSplit;
	
	public String[] sentanceSplit(String str) {
		
		return( stringSplit = str.split(" "));
	}

	public void displaySplit() {
		
		for(String str: stringSplit) {
			System.out.println(str);
		}
		
		
	}

	public static void main(String[] args) {
		Problem_2 problem2 = new Problem_2();
//		System.out.println(Arrays.toString(problem2.sentanceSplit("My name is Siddharth Sahu")));
		problem2.sentanceSplit("My name is Siddharth Sahu");
		problem2.displaySplit();
	}

}
