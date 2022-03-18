
public class Prob3 {//Here We Create one class and class name is prob3
	
	

	public static void main(String[] args) {//This is the main method of prob3
		// TODO Auto-generated method stub
	// Here we take one string value with lower case and upper case
		String Y="SAThyA";
		char[] ch= Y.toCharArray();//here we take char values
		
		System.out.println(ch);
		
		int Uc=0; 
		int Lc=0;//here we take integer of uppercase and lowercase values =0
		
		for(int i=0;i<=Y.length()-1;i++)//here we create one for loop
		{
			int X=ch[i];
			//System.out.println("X: "+X);
			
		if(X>=65 && X<=90)//Here we take if condition for upper case values
		{
			System.out.println("Upper case values --  "+((char)X));
			Uc++;//here we perform increment operations to uppercase 
			
		}
		else if(X>=97 && X<=122) //Here we take else condition for lower case values
		
			{
			System.out.println("Lower case values  --  "+((char)X));
				Lc++;//here we take perform increment operations to Lowercase
			}
		
		//Print Lower case values
			
			//Print Lower case values
		}
	}

}
