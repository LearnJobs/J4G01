package com.module2assignment;
/*Write a program to compare the strings with equals(), equalsignoreCase(),
*    compareTo(),endsWith(), startsWith().
*/
public class Problem_1 {
	
	public static void main(String[] args) {
		
		String str1 = "Siddharth Sahu";
		String str2 = "Siddharth Sahu";
		String str4 = "siddharth sahu";
		String str5 = "SIDDHARTH SAHU";
		String str6 = "Ashish Kumar";
		
		System.out.println(str1 +" is same as "+str2+" = "+str1.equals(str2));
		System.out.println(str1 +" is same as "+str6+" = "+str1.equals(str6));
		
		System.out.println(str4 +" is same as "+str5+"(ignore case) = "+str4.equalsIgnoreCase(str5));
		
		System.out.println(str1 + " startsWith \"S\" = " + str1.startsWith("S"));
		System.out.println(str6 + " startsWith \"S\" = " + str6.startsWith("S"));
		
		System.out.println(str1 + " endsWith \"S\" = " + str1.endsWith("u"));
		
		System.out.println(str1 +" compareTo  "+str2+" = "+str1.compareTo(str2));
		System.out.println(str1 +" compareTo  "+str6+" = "+str1.compareTo(str6));
	}

}
