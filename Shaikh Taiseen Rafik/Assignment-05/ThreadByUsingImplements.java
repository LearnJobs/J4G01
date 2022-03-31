package Assignment5;

public class ThreadByUsingImplements implements Runnable {
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadByUsingImplements ti=new ThreadByUsingImplements();
		Thread t = new Thread(ti);
		t.start();
		t.setName("Hello world..!!");
	}

}
