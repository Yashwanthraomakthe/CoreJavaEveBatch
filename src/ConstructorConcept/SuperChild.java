package ConstructorConcept;

public class SuperChild extends SuperParent{

	int minprice=100;
	
	public static void main(String[] args) {
		SuperChild sc = new SuperChild();
		sc.printMinBalance();

	}
	
	
	public  void printMinBalance() {
		
		System.out.println("Miniumum balance from child " + this.minprice);
		System.out.println("Miniumum balance from parent " + super.minprice);
		super.displayMinBalance();
		this.displayMinBalance();
	}
	
	public void displayMinBalance() {
		System.out.println("Miniumum balance from child ");

	}
	
	
	public void addition(int a, int b) {
		System.out.println("Miniumum balance from child ");
		System.out.println("Miniumum balance from child ");
		System.out.println("Miniumum balance from child ");
		
		System.out.println("Miniumum balance from child ");
		System.out.println("Miniumum balance from child ");
		System.out.println("Miniumum balance from child ");
		

	}
	
	public void addition(int a, String b) {
		System.out.println("Miniumum balance from child ");

	}
	
	

}
