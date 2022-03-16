
public class SalaryCheck 
{

	public static void main(String[] args)
	{
		int salary[] = {60000,40000,45000,50000,60000};
		for(int sal : salary)
		{
			try {
				if (sal>80000)
				{
					throw new SalaryException("Salary>80000");
				}
				else 
				{
					System.out.println(sal+"is valid salary");
				}
			}
			catch(SalaryException e) 
			{
				System.out.println("Salaey is more than the ceiling;"+e.getMessage());
				
			}
		}
	}

}
