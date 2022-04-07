
public class SplitMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String str= " Abc, pqr, xyz";
				String[] arrSplit=str.split(",");
				for(int i=0; i<arrSplit.length;i++)
				{
					System.out.println(arrSplit[i]);
				}

	}

}
