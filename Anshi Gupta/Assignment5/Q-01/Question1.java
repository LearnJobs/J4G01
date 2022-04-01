
public class Question1 {
	public class ThreadExt extends Thread 
	{
		public void run()
		{
			System.out.println("Hello world");
		}
		public static void main(String args[]) {
			Question1 th = new Question1();
			th.start();
			
		}
	}
	
}
