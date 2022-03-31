package Assignment5;

public class HelloThread extends Thread{
	
	public void run() {
		System.out.println("Hello world!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HelloThread thread = new HelloThread();
		thread.start();
	}
}
