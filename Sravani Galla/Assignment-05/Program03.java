package Assignment05;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class PrintNumbers implements Runnable
{
	@Override
	public void run() {
		System.out.println("Printing numbers from 1 to 10");
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
}
public class Program03{

	public static void main(String[] args) {
		 ExecutorService service = Executors.newSingleThreadExecutor();	// using single thread
		 service.execute(new PrintNumbers());
	}
}




