package StringMethods;

public class AvilablemethodsInStringClass {

	public static void main(String[] args) {
		charAtIndex();
		concatination();
		stringCompare();
		substring();
		stringLength();
		replace();
		tolowercase();
	}

	public static void charAtIndex() {
		String s1 = "Hyderabad";
		System.out.println(s1.charAt(3));

	}
	
	public static void concatination() {
		String s1 = "Hyderabad";
		String s2 = s1.concat(" City ");
		System.out.println(s2);

	}
	
	public static void stringCompare() {
		String s1 = "Hyderabad";
		String s2 = "hyderabad";
		System.out.println(s1.equalsIgnoreCase(s2));

	}
	
	
	public static void substring() {
		String s1 = "Hyderabad";
		System.out.println(s1.substring(3));

	}
	
	public static void stringLength() {
		String s1 = "Hyderabad";
		System.out.println(s1.length());

	}
	
	public static void replace() {
		String s1 = "Hyderabad";
		System.out.println(s1.replace('a', 'e'));

	}
	
	public static void tolowercase() {
		String s1 = "HYDERABAD";
		System.out.println(s1.toLowerCase());

	}
	
	

}
