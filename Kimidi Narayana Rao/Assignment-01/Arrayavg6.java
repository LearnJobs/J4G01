
public class Arrayavg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] =  {1,2,3,4,5,6,7,8};
		float sum=0,avg=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
			avg=sum/arr.length;
		
		System.out.println("Sum is: "+sum);
		System.out.println("Average is: "+avg);

	}

}
