import java.io.*;

public class problem5Book {

	public static void main(String[] args) {
		Book b = new Book();
		b.name="java";
		b.author ="xyz";
		// TODO Auto-generated method stub
		
		
		try
		{
			FileOutputStream fileout =new FileOutputStream("D:\\char.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(b);
			out.close();
			System.out.println("Dta is save in char.txt");
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

	}

}
