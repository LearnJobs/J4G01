package assignment02;

public class StringSplit 
{
	public static void main(String[] args) {
		String string = " I am enjoying java learning.";
		String[] stringArray=string.split(" ");
		for(String elements:stringArray)
				System.out.println(elements);
	}
}
