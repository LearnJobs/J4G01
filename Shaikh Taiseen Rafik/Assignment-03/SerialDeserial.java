package Assignment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SerialDeserialOperation implements Serializable{
	
	private static final long serialVersionUID = 1L;
	int number1;
	int number2;
	
	public SerialDeserialOperation(int number1, int number2) {
		super();
		this.number1 = number1;
		this.number2 = number2;
	}
	

}
public class SerialDeserial{

	public static void main(String[] args) throws IOException {
		
		SerialDeserialOperation sd = new SerialDeserialOperation(10,20);
		String fn= "D:/learnjobs/Module6/src/Assignment3/taiseen.txt";
		try{
			
			FileOutputStream file = new FileOutputStream(fn);
	        ObjectOutputStream out = new ObjectOutputStream(file);
	        
	        out.writeObject(sd);
	        out.close();
	        file.close();
	        System.out.println("Object has been serialized");
		}
		catch(Exception e){
			System.out.println("Exception cought");
		}
		
		SerialDeserialOperation sd2=null;
		try
        {   
  
            FileInputStream file = new FileInputStream(fn);
            ObjectInputStream in = new ObjectInputStream(file);
              
            // Method for deserialization of object
            sd2 = (SerialDeserialOperation)in.readObject();
              
            in.close();
            file.close();
              
            System.out.println("Object has been deserialized ");
            System.out.println("number1= " + sd2.number1);
            System.out.println("number2 = " + sd2.number2);
        }
          
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
          
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
	}

}
