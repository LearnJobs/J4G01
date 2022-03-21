package Assignment5;
public class Q1 extends Thread{
	
	public static void main(String[] args) {
		Q1 problem1 = new Q1();
		problem1.start();
	}
	public void run() {
		System.out.println("Hello World");
	}
}
