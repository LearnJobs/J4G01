package mm;

public class Question2 implements Runnable  {
	public void run()
	{
		System.out.println("Anshi!!!");
				}
	public static void main(String args[])
	{
		Question2 IR = new Question2();
		Thread th = new Thread(IR);
		th.start();
		
	}
}
