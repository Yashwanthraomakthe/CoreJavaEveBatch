package Collections;

import java.util.HashSet;

public class setConcept {

	public static void main(String[] args) {
		HashSet set = new HashSet();

		set.add('A');
		set.add(10);
		set.add("Java");
		set.add(10);

		System.out.println(set);

		set.add("Selenium");

		System.out.println(set);

		set.remove(10);
		
		System.out.println(set);

		System.out.println(set);
		set.add(10);

		System.out.println(set);

		HashSet setnew = new HashSet();

		setnew.add(2);
		setnew.add(2);

		set.add(setnew);

		System.out.println(set);

	}

}
