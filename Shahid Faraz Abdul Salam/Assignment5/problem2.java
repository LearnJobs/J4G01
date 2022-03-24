package Assignment5;

public class problem2 implements Runnable {
	
	public void run()
	{
		System.out.println("Hello World");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		problem2 p2 = new problem2();
		Thread t1 = new Thread(p2);
		t1.start();

	}

}
