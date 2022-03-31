package Assignment5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class PrintNumbers implements Runnable
{
	@Override
	public void run() {
		System.out.println("Numbers....");
		for(int i=1;i<=10;i++)
			System.out.println(i);
	}
}
public class Number {

	public static void main(String[] args) {
		 ExecutorService service = Executors.newSingleThreadExecutor();	
		 service.execute(new PrintNumbers());
	}
}
