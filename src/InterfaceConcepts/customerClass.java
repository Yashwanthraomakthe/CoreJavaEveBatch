package InterfaceConcepts;

import InheritanceConcepts.Cars;

public class customerClass implements HDFCInterface, RBIInterface {

	public static void main(String[] args) {
		Cars c = new Cars();
		
	}

	@Override
	public void display() {
		System.out.println("Balance " +1000);
		System.out.println("last withdral amount " +50);
		
	}

	@Override
	public void displayStatement() {
		// TODO Auto-generated method stub
		
	}

}
