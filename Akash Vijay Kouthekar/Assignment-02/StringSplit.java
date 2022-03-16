/* Program 02 : Split the sentence to generate different Strings and print the string
				seperately. (Hint : use split() method */

package assignment02;
public class StringSplit 
{
	public static void main(String[] args) {
		String string = "Learning Java is so much fun.";
		String[] stringArray=string.split(" ");
		for(String elements:stringArray)
				System.out.println(elements);
	}
}
