package Assignment5;

	import java.util.concurrent.ExecutorService;
	import java.util.concurrent.Executors;
	
	class Numbers implements Runnable
	{
		@Override
		public void run() {
			for(int i=1;i<=10;i++)
				System.out.print(i+" ");
		}
	}
	public class ExecutorFrameWork {
		public static void main(String[] args) {
			 ExecutorService service = Executors.newSingleThreadExecutor();
			 service.execute(new Numbers());	
		}
	}


