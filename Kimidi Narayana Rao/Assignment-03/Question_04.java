

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Question_04 
{

	public static void main(String[] args) throws IOException
	{
		File fi = new File("C:\\Users\\Narayana Rao\\eclipse-workspace\\Assignment-03\\src\\file1.txt");
		FileReader fr = new FileReader(fi);
		FileWriter fw = new FileWriter("C:\\Users\\Narayana Rao\\eclipse-workspace\\Assignment-03\\src\\file2.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str=null;
		
		
		while((str = br.readLine())!= null)
		{
		
		fw.write(str);
		fw.write("\n");
		fw.flush();
		
		}
		System.out.println(" Data is transeferrd from file-1 to file-2");
		
		fw.close();
	}   

}
