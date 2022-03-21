import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDeserializable implements Serializable {
	int id;
	String bookname;
	String bookauthor;
	
	public SerializableDeserializable(int id,String bookname,String bookauthor){
		this.id=id;
		this.bookname=bookname;
		this.bookauthor=bookauthor;
	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException{
		// TODO Auto-generated method stub
		
		//SERIALIZATION
		SerializableDeserializable sd=new SerializableDeserializable(07,"Dr.RajKumar","Dr.Puneeth RajKumar ");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:/Deepa"));
		oos.writeObject(sd);
		System.out.println("BOOK SERIALIZATION");
		
		//DESERIALIZATION
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("D:/Deepa"));
		SerializableDeserializable deserialized =(SerializableDeserializable)ois.readObject();
		System.out.println("BOOK DESERIALIZATION");
		System.out.println(deserialized);
		
		
		
	}

}


