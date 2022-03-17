import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileReadWrite {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter File Name :");
		String filename = s.next();
		try {
			FileInputStream fis = new FileInputStream(filename);
			FileOutputStream fos = new FileOutputStream(filename +"Out");
			int i = 0;
			while((i=fis.read()) !=-1) {
				fos.write(i);
			}
			fos.close();fis.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File does not exist!");
			
		}catch(IOException e) {
			
		}
		

	}

}
