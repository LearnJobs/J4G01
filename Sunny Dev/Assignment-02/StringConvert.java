import java.util.Scanner;

public class StringConvert
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str="";
		System.out.print("Enter any string");
		str=sc.nextLine();
		String lowerCaseString="", upperCaseString="";
		
		// Convert into lower case
		
		lowerCaseString=str.toLowerCase();
		// Convert into upper case
		
		upperCaseString=str.toUpperCase();
		
		// print String
		
		System.out.println("String:"+str);
		System.out.println("Lower Case String:"+lowerCaseString);
		System.out.println("Upper Case String:"+upperCaseString);
		
		}
	}

	