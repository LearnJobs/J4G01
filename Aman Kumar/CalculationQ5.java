import java.util.*;
public class CalculationQ5 {
	public static int additionMethod(int cal[])
	{
		int sum=0;
		for(int i=0;i<cal.length;i++)
		{
			 sum=sum+cal[i];
		}
		return sum;
	}
	public static void averageMethod(int cal[])
	{
		int sum=additionMethod(cal);
		double average= (1.00*sum)/cal.length;
		System.out.println("Average No : "+average);
	}
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int n=sc.nextInt();
	int[] cal = new int[n];
	for(int i=0;i<n;i++)
	{
		cal[i]=sc.nextInt();
	}
	System.out.println(additionMethod(cal));
	averageMethod(cal);
	}
}
