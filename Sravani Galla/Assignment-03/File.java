package Assignment3;
 import java.io.FileInputStream;
 import java.io.FileNotFoundException;
 import java.io.FileOutputStream;
 import java.io.IOException;
 import java.util.Scanner;


public class File {
public static void main(String[] args) 
{
		Scanner Scan = new Scanner(System.in);
		System.out.println("enter File name:");
		String Fiename=Scan.next();
		try
		{
		FileInputStream fis=new FileInputStream("Filename");
		FileOutputStream fos = new FileOutputStream("Filename"+"ab");
		int i = 0;
		while((i=fis.read())!=-1)
		{
			fos.write(i);
		}
		fos.close();
		fis.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("file doesnot exsist!");
		}
		catch(IOException e) {
		}
			
		}
		
	}


