package Assignment05;
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Hello World");
	}
}
public class Program01 {

	public static void main(String[] args) {
		MyThread thread = new MyThread();		  
		thread.start();						 
	}
}



