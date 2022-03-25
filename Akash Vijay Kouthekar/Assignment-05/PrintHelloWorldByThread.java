// Program 01 : Create a Thread to print Hello World extending Thread class

package assignment05;
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Hello World");
	}
}
public class PrintHelloWorldByThread {

	public static void main(String[] args) {
		MyThread thread = new MyThread();		  
		thread.start();						 
	}
}
