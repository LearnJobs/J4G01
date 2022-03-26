package assignment3;

public class Question3 
{
	public static void main(String[] args) 
	{
		CalculateGrossSalary(90000);
	}
	private static void CalculateGrossSalary(int basic)
	{
		if(basic>80000)
		{
			try
			{
				throw new SalaryException();
			}
			catch(SalaryException se)
			{
				System.err.print(se.getMessage());
			}
		}
		else
		{
			double gross=basic + 1200 + 1500;
			System.out.print("Salar is : "+gross);
		}
	}
}
//	int empSalary, empId;
//	String empName;
//	
//	 public SalaryException (int empSalary )  
//	    {  
//	        // calling the constructor of parent Exception  
//	        super(str);  
//	    }  
//
//	public void findSalary() throws SalaryException {
//		 {
//			 if (empSalary > 80000)
//			throw new SalaryException("Salary Error");
//
//		}
//	}
//
//	public static void main(String[] args) {
//		try {
//			empSalary = 80000;
//			System.out.print(empName + " salary is : " + empSalary);
//		} 
//		catch (SalaryException ex)
//		{
//			System.out.print("Caught the Exception");
//		}
//	}

