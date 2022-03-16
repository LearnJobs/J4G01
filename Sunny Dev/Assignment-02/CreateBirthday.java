import java.sql.*;
import java.sql.Date;
import java.util.*;

public class CreateBirthday
{
	private Date birthday;
	private String name;
	private int idNumber;
	private String gender;

	public void Employee(String name, int idNumber, String gender, 
	    int year, int month, int day) 
	{

	    this.name  = name;
	    this.idNumber = idNumber;
	    this.gender = gender;
	    initBirthday(year, month, day);
	}

	private void initBirthday(int year, int month, int day) 
	{
	    // all int should be greater than 0 
	    if (year > 0 && month > 0 && day > 0) 
	    {
	        Calendar cal = Calendar.getInstance();
	        cal.set(year, month-1 , day, 0, 0, 0);
	// OR the explicit way 
	 //           cal.set(Calendar.YEAR, year);
	 //           cal.set(Calendar.MONTH, month - 1); // january == 0 !!!!
	 //           cal.set(Calendar.DAY_OF_MONTH, day);
	 //           cal.set(Calendar.HOUR,0);
	 //           cal.set(Calendar.MINUTE,0);
	 //           cal.set(Calendar.SECOND,0);
	            birthday = (Date) cal.getTime(); // this returns a Date
	    } else 
	    {
	       // set birthday to a default value...
	    }
	}

}
