import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class problem4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileReader fr = new FileReader("D:\\file1.txt");
			FileWriter fw = new FileWriter("D:\\file2.txt");
			String str ="";
			int i;
			
			while((i=fr.read())!=-1)
			{
				str +=(char)i;
			}
			System.out.println(str);
			fr.close();
			fw.close();
			System.out.println("File reading and writing both done");
		}
		  catch (IOException e) {
			  
	        
	            System.out.println(
	                "There are some IOException");
	        }
	}

}
