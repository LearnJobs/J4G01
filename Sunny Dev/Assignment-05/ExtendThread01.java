//01.Create a thread to print Hello world extending thread class

public class ExtendThread01 extends Thread 
{
	public ExtendThread01() 
	{

	}

	public void run() 
	{
		System.out.println("Welcome to the GAVS Technologies");
	}

	public static void main(String[] args) 
	{
		
		ExtendThread01 threadclass = new ExtendThread01();
		threadclass.start();
	}

}