package Carry;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.FileIOException;
import java.util.Scanner;

public class ReadWrite {//here i create one class
	public static void main(String[] args)//this is the main method of the class
	{
		Scanner Scan=new Scanner(System.in);//here i m using scanner because to the value
		System.out.println("enter File name:");//to print the stmt
		String Filename=Scan.next();//to read the string value by using the scanner class
		//here i m using the try catch block method
		try
		{
			FileInputStream fis=new FileInputStream(Filename);//here i m using the fileinputstream(fis) of the object
			FileOutputStream fos=new FileOutputStream(Filename+"ab");//here i m using the fileoutputstream(fos) of the object
			int i=0;//here i take int type variable
			while((i=fis.read())!=-1)//here i m using the while condition
			{
				fos.write(i);//here i calculate the fos to write the int i 
			}
			fos.close();//here i calculate the fos by the close method
			fis.close();//here i calculate the fis by the close method
		}
		catch(FileNotFoundException e)
		{
			System.out.println("file doesnot exsist!");
		}
		catch(IOException e)
		{
	}
	}
}
