package Task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QuestionMain3 {
	public static void main(String[] args) {
		ExecutorService service =Executors.newSingleThreadExecutor();	// using single thread
		  service.execute(new Question3());	
}
}