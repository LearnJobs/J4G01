//Create a thread to print HelloWorld by implementing Runnable Interface.
public class Problem_2 implements Runnable{

	public static void main(String[] args) {
		Problem_2 problem2 = new Problem_2();
		Thread thread = new Thread(problem2);
		thread.run();
	}

	@Override
	public void run() {
		System.out.println("Hello World");
	}

}
