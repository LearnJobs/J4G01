

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Question_05 implements Serializable {
	int id;
	String bookname;
	String bookauthor;
	
	public Question_05(int id,String bookname,String bookauthor){
		this.id=id;
		this.bookname=bookname;
		this.bookauthor=bookauthor;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		
		//SERIALIZATION
		Question_05 sd=new Question_05(443,"Narayana Rao","Kimidi");
		ObjectOutputStream os=new ObjectOutputStream(new FileOutputStream("C:\\Users\\Narayana Rao\\eclipse-workspace\\Assignment-03\\src\\seilfile.txt"));
		os.writeObject(sd);
		System.out.println("Book Serilization");
		
		//DESERIALIZATION
		ObjectInputStream oist=new ObjectInputStream(new FileInputStream("C:\\Users\\Narayana Rao\\eclipse-workspace\\Assignment-03\\src\\seilfile.txt"));
		Question_05 deserialized =(Question_05)oist.readObject();
		System.out.println("Book Deserilization");
		System.out.println(deserialized);
		
		
		
	}

}