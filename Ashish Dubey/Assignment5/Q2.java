package Assignment5;
public class Q2 implements Runnable{

	public static void main(String[] args) {
		Q2 problem2 = new Q2();
		Thread thread = new Thread(problem2);
		thread.run();
	}

	@Override
	public void run() {
		System.out.println("Hello World");
	}

}