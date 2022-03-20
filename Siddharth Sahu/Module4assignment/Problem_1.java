//Create a thread to print HelloWorld extending Thread class

public class Problem_1 extends Thread{
	
	public static void main(String[] args) {
		Problem_1 problem1 = new Problem_1();
		problem1.start();
	}
	public void run() {
		System.out.println("Hello World");
	}
}
