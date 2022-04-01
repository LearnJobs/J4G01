package Assignment05;

public class program02 {
	class MyThread extends Thread
	{
		public void run()
		{
			System.out.println("Hello World");
		}
	}
	public class PrintHelloWorldByThread {

		public static void main(String[] args) {
			MyThread th = new MyThread();		  
			th.start();						 
		}
	}

}
