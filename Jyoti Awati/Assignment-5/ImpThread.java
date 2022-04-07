package Assignment5;

//Q : 2

public class ImpThread implements Runnable {
	public void run() {
		System.out.print("HelloWorld");
	}

	public static void main(String[] args) {
	 ImpThread t = new ImpThread();
	 Thread t1 = new Thread(t);
     t1.start();
	}

}
