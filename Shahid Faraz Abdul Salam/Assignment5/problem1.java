package Assignment5;


//Thread 
public class problem1 extends Thread {
	
	public void run()
	{
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem1 p = new problem1();
		p.start();

	}

}
