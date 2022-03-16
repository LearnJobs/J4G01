
public class StringSplitMethod 
{

	public static void main(String[] args) 
	{
		String str= "Alpha, Beta, Delta, Gamma, Sigma";
		String[] arrSplit=str.split(",");
		for(int i=0; i<arrSplit.length;i++)
		{
			System.out.println(arrSplit[i]);
		}
	}

}
