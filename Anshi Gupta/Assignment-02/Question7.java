package CompareString;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class Question7 
{

	String employeeName;
	
	public Question7 (String employeeName)
	{
		this.employeeName = employeeName;
	}
	void display()
	{
		System.out.println(employeeName);
	}
	//@SuppressWarnings("unused")
	
	public static void main(String[] args) 
	{
		Question7 b=new Question7("Rajiv Jain");
		LocalDate ld=LocalDate.now();		
		LocalDate specifiedDate=LocalDate.of(1990, Month.APRIL ,6);
		b.display();
		//System.out.println(b);
		System.out.println("Birthday is "+specifiedDate);
		int year= Period.between(ld, specifiedDate).getYears();
		System.out.println("age :"+year);
	
		
		//@SuppressWarnings("unused")
//		LocalDate today = LocalDate.now();
//		System.out.println(today);
		// TODO Auto-generated method stub
	}
}
