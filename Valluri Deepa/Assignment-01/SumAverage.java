import java.util.Scanner;

public class SumAverage  {
	public static int average(int a[], int n)
	    {
	        int addition=0;
	        for (int i=0;i<n;i++)
	        {
	        	addition += a[i];
	        }
	        System.out.println("Addition of array is "+addition);
	        return addition/n;
	    }

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
        int n; 
        System.out.println("Enter the size of an array ");
        n=scanner.nextInt();    
        int array[] = new int[n];    
        System.out.println("Enter the array elements ");
        for(int i=0;i<n;i++)     
        {
            array[i]=scanner.nextInt();
        }
     
        System.out.println("The average array is "+average(array,n));
	}

}


