package module3;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Book4 b1 = new Book4(101, "Core Java");
		ObjectInputStream oos = new ObjectInputStream(new FileInputStream("D:\\Uma\\eclipse-workspace\\module3\\book.txt"));
		Book4 b2= (Book4) oos.readObject();
		System.out.println(b2);

	}

}
