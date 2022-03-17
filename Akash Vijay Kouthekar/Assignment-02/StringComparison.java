/* Program 01 : Write a program to compare two strings with equals(),equalsIgnoreCase(),compareTo(), endsWith(), startsWith() */

package assignment02;
public class StringComparison {

	public static void main(String[] args) {
		String string1 = "Akash Kouthekar";
		String string2 = "Akash kouthekar";
		
		if(string1.equals(string2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		if(string1.equalsIgnoreCase(string2))
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		int result= string1.compareTo(string2);
		if(result==0)
			System.out.println("Equal");
		else
			System.out.println("Not equal");
		
		if(string1.startsWith("Akash"))
			System.out.println("True");
		else
			System.out.println("False");
		
		if(string1.endsWith("Kouthekar"))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
