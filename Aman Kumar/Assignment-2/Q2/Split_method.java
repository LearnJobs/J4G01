package Q2;

public class Split_method {
		String s1= "i love to code in java language";
		public void split()
		{
			String [] arr = s1.split(" ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
}
