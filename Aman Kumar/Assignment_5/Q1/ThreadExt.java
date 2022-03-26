package Q1;

public class ThreadExt extends Thread {
	public void run()
	{
		System.out.println("Hello world");
	}
	public static void main(String args[]) {
		ThreadExt th = new ThreadExt();
		th.start();
		
	}

}
