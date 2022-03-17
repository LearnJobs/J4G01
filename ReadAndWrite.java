package Q4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWrite {
	public static void main(String[] args) throws IOException 
	{
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("E://abc.txt"));
				PrintWriter printWriter = new PrintWriter("E://xyz1.txt"))
		{
			String line = bufferedReader.readLine();	
			while(line!=null)							
			{
				printWriter.println(line);				
				line=bufferedReader.readLine();			
			}
			System.out.println("Data written to file successfully");
		}
		catch(IOException exception)
		{
			System.err.println(exception);
		}
	}
}
