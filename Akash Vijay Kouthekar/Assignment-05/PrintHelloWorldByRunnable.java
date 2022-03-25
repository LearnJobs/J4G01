// Program 02 : Create a thread to print HelloWorld by implementing Runnable interface

package assignment05;
class MyRunnable implements Runnable
{
	public void run()
	{
		System.out.println("Hello World");
	}
}
public class PrintHelloWorldByRunnable {

	public static void main(String[] args) {
		MyRunnable myRunnable = new MyRunnable();		  
		Thread t = new Thread(myRunnable);
		t.start();
	}
}