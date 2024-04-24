package multithreading;

class runnable1 implements Runnable {

	public void run() {
		int i = 0;
		while (i < 15) {
			System.out.println("Thread 1");
			i++;
		}
	}

}

class runnable2 implements Runnable {

	public void run() {
		int i = 0;
		while (i < 15) {
			System.out.println("Thread 2");
			i++;
		}
	}

}

public class CreateThreadByRunnableInterface {

	public static void main(String[] args) {
		runnable1 r1 = new runnable1();
		Thread t1 = new Thread(r1);
		t1.start();
		
		
		runnable2 r2 = new runnable2();
		Thread t2 = new Thread(r2);		
		t2.start();

	}

}
