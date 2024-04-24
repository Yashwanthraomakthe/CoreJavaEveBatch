package ExceptionHandling;

public class CustumException extends RuntimeException {

	CustumException(String s) {
		super(s);
	}

	public static void main(String[] args) {

		int age = 17;
		if (age < 18) {
			throw new CustumException(" Your are not eligible");

		}

	}

}
