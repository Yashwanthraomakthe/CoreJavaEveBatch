package JavaBasics;

public class ConstructorConcept {

	String name;
	int rollnumber;

	public ConstructorConcept() {
		System.out.println("I am from Default constructor");
	}

	public ConstructorConcept(String name2, int rollnumber2) {
		this.name = name2;
		this.rollnumber = rollnumber2;
	}

	public static void main(String[] args) {
		
		ConstructorConcept cc = new ConstructorConcept();

		ConstructorConcept cc1 = new ConstructorConcept("Core", 101);
		ConstructorConcept cc2 = new ConstructorConcept("Java", 102);

		System.out.println(cc1.name);
		System.out.println(cc1.rollnumber);
		System.out.println(cc2.name);
		System.out.println(cc2.rollnumber);

	}

}
