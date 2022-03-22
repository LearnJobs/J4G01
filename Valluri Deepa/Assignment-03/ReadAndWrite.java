import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				try {

					System.out.println("===============Write Operation================");
					FileOutputStream fout = new FileOutputStream("D:\\testout.txt");
					String s = "Welcome to My World MD Good ";
					byte b[] = s.getBytes();// converting string into byte array
					fout.write(b);
					fout.close();
					System.out.println("success your file is save");

					System.out.println("===============Read Operation================");
					FileInputStream fin = new FileInputStream("D:\\testout.txt");
					int i = 0;
					while ((i = fin.read()) != -1) {
						System.out.print((char) i);
					}
					fin.close();

				} catch (Exception e) {
					System.out.println(e);
				}
			}
	}


