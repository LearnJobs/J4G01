package Assignment5;

public class HelloThread extends Thread{
	public void run() {
		System.out.println("HellWorld");
	}
	public static void main(String[] args) {
		HelloThread t = new HelloThread();
		t.start();
	}

}
