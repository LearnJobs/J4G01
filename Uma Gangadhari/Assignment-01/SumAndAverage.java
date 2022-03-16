//Program 06
//Write a Program to Calculate addition and average of integer array passed to a function

public class SumAndAverage {
	
		static int sum1=0;

		public static void main(String[] args) {
			int[] a=new int[] {10,20,30,40,50};
			SumAndAverage a1=new SumAndAverage();
			for (int i=0;i<a.length;i++)
			a1.sum(a[i]);
			System.out.println("Sum="+sum1);
			a1.average(a.length);
		}
	public void sum(int s)
	{
	sum1=sum1+s;
	}
	public void average(int length)
	{
	int average=0;
	average=sum1/length;
	System.out.println("average"+average);
	}
	}


