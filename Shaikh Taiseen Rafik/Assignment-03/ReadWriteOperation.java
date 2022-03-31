package Assignment3;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteOperation {

	public static void main(String[] args) {
		
		try{
			
			FileReader fr = new FileReader("D:/learnjobs/Module6/src/Assignment3/taiseen.txt");
			FileWriter fw = new FileWriter("D:/learnjobs/Module6/src/Assignment3/output.txt");
			String str = "";
			int i;
			while((i = fr.read()) != -1)
				str+=(char)i;
			System.out.println(str);
			fw.write(str);
		}catch(Exception e){
			System.out.println(e);
		}

	}

}
