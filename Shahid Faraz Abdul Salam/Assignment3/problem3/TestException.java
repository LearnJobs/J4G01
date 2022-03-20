public class TestException {
	
	static double grossSalary,incomeTax,providentfund,salary;

	 
	static void validate(double salary )throws wrongSalaryException
	{
		if(salary>80000)
		{
			throw new wrongSalaryException("Salary is greater than 80000");
		}
	
	}


public static void main(String[] args)
{
	TestException tc = new TestException();
	Scanner sc = new Scanner(System.in);
	System.out.println("Gross Salary");
	grossSalary =sc.nextDouble();
	System.out.println("Income Tax");
	incomeTax =sc.nextDouble();
	System.out.println("Enter Provident Fund");
	providentfund=sc.nextDouble();
	
	try
	{
		salary=grossSalary+incomeTax+providentfund;
		//validate(90000);
		tc.validate(salary);
	}
	catch(wrongSalaryException se)
	{
		System.out.println("Exception occured"+se);
	}
}
}
