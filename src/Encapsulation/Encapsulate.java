package Encapsulation;

public class Encapsulate {
	
	private int Balance;
	
	public int getBalance() {
		return Balance;
	}

	public void setBalance(int balance) {
		Balance = balance;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	private String Name;

	public static void main(String[] args) {
		Encapsulate e = new Encapsulate();
		e.setBalance(2000);		
		e.setName("Yashwanth");
		
		
		System.out.println("Your Name " + e.getName());
		System.out.println("Your Balance " + e.getBalance());
		
		

	}

}
