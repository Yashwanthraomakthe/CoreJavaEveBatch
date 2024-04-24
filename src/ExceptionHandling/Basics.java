package ExceptionHandling;

public class Basics {

	public static void main(String[] args) {
		addition();

	}

	public static void addition() {
		System.out.println("I am doing addition work");
		division();

	}

	public static void division() {
		System.out.println("I am doing division work");
		try {
			System.out.println(10 / 0);

		}

		catch (ArithmeticException e) {
			System.out.println("Expection occured");
		}

		catch (Exception e) {
			System.out.println("Expection occured");
		}

		finally {
			System.out.println("I am doing clean up ");
		}

	}

}
