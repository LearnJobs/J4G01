package Q3;

public class SalaryOfEmployee {
	public static void main(String[] args)  {
		double empSalary=80000;
		if(empSalary>80000) {
				try {
					throw new SalaryException();
					}
				catch(SalaryException salaryException){
					System.err.print("Salary should less 80000");
				}
			}
		else
		{
			empSalary += 15000;
			System.out.println("salary : "+empSalary);
		}
	}
}
