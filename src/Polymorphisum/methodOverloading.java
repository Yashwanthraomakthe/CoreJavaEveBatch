package Polymorphisum;

public class methodOverloading {

	public static void main(String[] args) {
		methodOverloading mo = new methodOverloading();
		mo.multiplication(2, 5);
		mo.multiplication(2, 5, 2);

	}

	public  void multiplication(int a, int b) {
		int result = a * b;
		System.out.println("Multiplication of two numbers " + result);
	}
	
	public void multiplication(int a, int b, int c) {
		int result = a * b *c;
		System.out.println("Multiplication of three numbers " + result);
	}

}
