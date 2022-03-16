// Program 04 : Write a program to read a file & write its content to other file

// I am using try with resources feature because i don't want to close the 
// resources manually & while accessing resources there may be chance of 
// raising FileNotFoundException or IOException therefore handling it with only
// one catch block because FileNotFoundException is subclass of IOException
// Therefore i'm writing IOException in catch block to handle both exception

package assignment03;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadAndWriteFile {

	public static void main(String[] args) throws IOException 
	{
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader("D://abc.txt"));
				PrintWriter printWriter = new PrintWriter("D://xyz.txt"))
		{
			String line = bufferedReader.readLine();	// Reading first line of abc.txt
			while(line!=null)							//checking that line is empty or not
			{
				printWriter.println(line);				// writing line to xyz.txt file
				line=bufferedReader.readLine();			// reading next line of abc.txt
			}
			System.out.println("Data written to file successfully");
		}
		catch(IOException exception)
		{
			System.err.println(exception);
		}
	}
}
