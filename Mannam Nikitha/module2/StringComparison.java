package assignment02;

public class StringComparison {

	public static void main(String[] args) {
		String string1 = "nikhitha Rohini";
		String string2 = "nikhitha Rohini";
		
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
		
		if(string1.startsWith("nikhitha"))
			System.out.println("True");
		else
			System.out.println("False");
		
		if(string1.endsWith("Rohini"))
			System.out.println("True");
		else
			System.out.println("False");
	}
}