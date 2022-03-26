package CompareString;

import java.time.LocalDate;
import java.time.Month;

public class Birtthday 
{
	String employeeName;
	
	public Birtthday (String employeeName)
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
		Birtthday b=new Birtthday("Rajiv Jain");
		LocalDate ld=LocalDate.of(1990, Month.APRIL ,6);
		b.display();
		//System.out.println(b);
		System.out.println(ld);
	
		
		//@SuppressWarnings("unused")
//		LocalDate today = LocalDate.now();
//		System.out.println(today);
		// TODO Auto-generated method stub

	}

}
