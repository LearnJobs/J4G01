package Com.Strings;

//import java.time.localDate;
//import java.time.period;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Scanner;
//import java.io.localdate;
public class Prob8 // here i create one class and my class name is prob8
{
	public static void main(String[] args) 
	{//this is the main method of the prob8
		Scanner S=new Scanner(System.in);// here we read the value of S
System.out.println("enter the current day");// here we entering  the dateofbirth 
String input=S.nextLine();//here i m using the int type value of string type variable

		LocalDate data=LocalDate.parse(input);//here i calculate the localdate by using the parse
		System.out.println("today is:");//here to print the old age
	}
	public static  int CalculateAge(LocalDate dob) {//i m using the static method to calculate age
		Object local;//here i create the object for local of objdate
		Object objDate = 17;
		
		if((dob!=null)&&(objDate!=null)) {//here i m using the if condition
			System.out.println("today is sunday");// if the condition is true then it print
			
		}
		else {
			System.out.println("not sunday");// here if the condition is false then it print
		}
		return 0;
	}
	
}
