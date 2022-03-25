// Program 03 : Write a program to use ExecutorFramework to print numbers from 1 to 10

package assignment05;
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
public class PrintNumbersByExecutorFramework {

	public static void main(String[] args) {
		 ExecutorService service = Executors.newSingleThreadExecutor();	// using single thread
		 service.execute(new PrintNumbers());		// we can also use anonymous inner class instead of top level concrete class
	}
}
