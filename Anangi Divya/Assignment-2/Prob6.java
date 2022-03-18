package Com.Strings;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;

public class Prob6
{
	

			public static void main(String[] args) throws ParseException
			{
				
		  //direct age calculation 
		  LocalDate l = LocalDate.of(1998, 04, 23); //specify year, month, date directly
		  LocalDate now = LocalDate.now(); //gets localDate
		  Period diff = Period.between(l, now); //difference between the dates is calculated
		  System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");

		  //using Calendar Object
		  String s = "1990/04/6";//here i take int type of string value
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");// here i  m using simple date formatt object
		  Date d = (Date) sdf.parse(s);//i calculate the date by using parse
		  Calendar c = Calendar.getInstance();//here i calculate the calender by using get insttance
		  c.setTime(d);// here i get c by using set time method
		  int year = c.get(Calendar.YEAR);//here we are using the int variable type to calculate the year by using get method
		  int month = c.get(Calendar.MONTH) + 1;//here we are using the int variable type to calculate the month by using get method
		  int date = c.get(Calendar.DATE);//here we are using the int variable type to calculate the day by using get method
		  LocalDate l1 = LocalDate.of(year, month, date);//here i take localdate (l1) 
		  LocalDate now1 = LocalDate.now();//here i take localdate(now1)
		  Period diff1 = Period.between(l1, now1);// here i m using the period because to calculate the diff. b/w l1 & now1
		  System.out.println("age:" + diff1.getYears() + "years");// finally to print the final age
		 }
		}


