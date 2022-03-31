package Assignment3;

public class SalaryExceptionHandle {

	public static void main(String[] args) {
		double salary=80000;
		SalaryException e=new SalaryException();
		if(salary>=80000) {
				try {
					throw e;
					}
				catch(SalaryException se){
					System.out.println(se.msg());
				}
		}
		else
			salary+=1000;
			System.out.println("salary:"+salary);
	}

}
