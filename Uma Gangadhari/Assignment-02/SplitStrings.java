
public class SplitStrings {
	public static void main(String[] args)
	{
		String str1="Gangadhari Uma";
		String[] name=str1.split("\\s");	
		for(String n:name)
	{
		System.out.println(n);
	}
	}
}

	




/* String[] words=s1.split("\\s");//splits the string based on whitespace  
//using java foreach loop to print elements of string array  
for(String w:words){  
System.out.println(w);  
}  
}}  
*/
