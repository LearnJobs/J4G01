import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Printing numbers from 1 to 10");
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
	}
	

}