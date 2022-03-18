package Com.Strings;

public class Prob2 {//here i create one class and class name is prob2

	public static void main(String[] args)//this is the main method of prob2
	{
	
		String s1="java string split method by javatpoint";  //here i take one string value
		String[] words=s1.split("\\s");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array  
		for(String w:words)//by using for each loop
		{  
		System.out.println(w);  // to print w
		}  
		}
	}  


