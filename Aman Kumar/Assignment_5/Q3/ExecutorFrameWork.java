package Q3;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrameWork {
	public static void main(String[] args) {
		 ExecutorService service = Executors.newSingleThreadExecutor();	// using single thread
		 service.execute(new Task());		// we can also use anonymous inner class instead of top level concrete class
	}

}
