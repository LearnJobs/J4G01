
public class Prob1 {//here i create one class and my class name is prob1

	public static void main(String[] args)//this is the main method of prob1
	{
		String str1=new String("India");// here i take str1 value of string type variable
		
		String str2=new String("Welcome India");//here i take str2 value of string type variable
		
		System.out.println("str1.length");//to print the length of str1
		
		System.out.println("str2.length");//to print the length of str2
		
		System.out.println(str1.equals(str2));// here i calculate the equals of two strings by using equals method
		
		System.out.println(str1.equalsIgnoreCase(str2));//here i calculate the equalsignorecase of two strings by using equalsIgnoreCase method
		
		System.out.println(str1.compareTo(str2));//here i calculate the compareto of two strings by using CompareTo method
		
		System.out.println(str1.endsWith(str2));//here i calculate the endswith of two strings by using endswith method
		
		System.out.println(str1.startsWith(str2));//here i calculate the startswith of two strings by using startwithmethod
 	}
}
