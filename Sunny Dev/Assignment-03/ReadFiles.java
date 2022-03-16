import java.io.*;

public class ReadFiles 
{

	public static void main(String[] args) 
	{
		File inf= new File("hello world");
		File outf = new File("hello ");
		FileReader r= null;
		FileWriter w=null;
		try
		{
			r = new FileReader(inf);
			w = new FileWriter(outf);
			int ch;
			while((ch=r.read())!=-1)
			{
				w.write(ch);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		
		}
	}

}
