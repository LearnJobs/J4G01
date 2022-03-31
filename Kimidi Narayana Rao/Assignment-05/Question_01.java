
public class Question_01 extends Thread{
	
	public static void main(String[] args) {
		Question_01 ho = new Question_01();
		ho.start();
	}
	public void run() {
		System.out.println("Hello World");
	}
}