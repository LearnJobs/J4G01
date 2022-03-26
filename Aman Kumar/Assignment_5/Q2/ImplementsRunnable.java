package Q2;

public class ImplementsRunnable implements Runnable {
	public void run()
	{
		System.out.println("Hello world!!!");
				}
	public static void main(String args[])
	{
		ImplementsRunnable IR = new ImplementsRunnable();
		Thread th = new Thread(IR);
		th.start();
		
	}

}
