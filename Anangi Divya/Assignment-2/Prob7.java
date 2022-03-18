

		// TODO Auto-generated method stub
		import java.text.ParseException;
		import java.text.SimpleDateFormat;
		import java.time.LocalDate;
		import java.time.Period;
		import java.util.Calendar;
		import java.util.Date;
		
		public class Prob7 {// here i create a one class and my class name is prob7
			
			public static void main(String[] args) throws ParseException {//this is the main method of class prob7
				
		  //direct age calculation 
		  LocalDate l = LocalDate.of(1990, 04, 6); //here i specify year, month, date directly
		  LocalDate now = LocalDate.now(); //by using gets localDate
		  Period diff = Period.between(l, now); //here i use period difference between the dates is calculated
		  System.out.println(diff.getYears() + "years" + diff.getMonths() + "months" + diff.getDays() + "days");//print the local date 

		  //using Calendar Objects
		  String  s = "1990/04/6";// here i m using string variable type
		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");//hare i take simple date(sdf) formatt
		  Date d = sdf.parse(s);//here  i m using parse
		  Calendar c = Calendar.getInstance();// here i calculate the calender
		  c.setTime(d);//here i m using set method
		  int year = c.get(Calendar.YEAR);// here by using get we calculate year
		  int month = c.get(Calendar.MONTH) + 1;// here by using get we calculate month
		  int date = c.get(Calendar.DATE);// here by using get we calculate date
		  LocalDate l1 = LocalDate.of(year, month, date);// here i take present year, month, date
		  LocalDate now1 = LocalDate.now();//here i take present local date
		  Period diff1 = Period.between(l1, now1);// here also i m using the period . to calculate present age
		  System.out.println("age:" + diff1.getYears() + "years");//to print the present age
		 }
		} 