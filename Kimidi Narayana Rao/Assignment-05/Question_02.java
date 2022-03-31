
public class Question_02 implements Runnable{

	public static void main(String[] args) {
		Question_02 h = new Question_02();
		Thread thread = new Thread(h);
		thread.run();
	}

	@Override
	public void run() {
		System.out.println("Hello World");
	}

}