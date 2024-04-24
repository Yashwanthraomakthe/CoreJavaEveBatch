package ExceptionHandling;

public class throwsExample {

	public static void main(String[] args) throws InterruptedException {
		addition();

	}

	public static void addition() throws InterruptedException {
		System.out.println("I am doing addition work");
		substraction();

	}

	public static void substraction() throws InterruptedException {
		System.out.println("I am doing addition work");
		division();

	}

	public static void division() throws InterruptedException {
		Thread.sleep(2000);

	}

}
