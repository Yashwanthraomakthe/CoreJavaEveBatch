package Collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add('A');
		list.add(10);
		list.add("Java");
		list.add(10);
		
		System.out.println(list);
		
		list.add("Selenium");
		
		System.out.println(list);
		
		list.remove(1);
		System.out.println(list);
		
		list.add(1, 10);
		
		System.out.println(list);
		list.add(10);
		
		System.out.println(list);
		
		
		ArrayList listnew = new ArrayList();
		
		listnew.add(2);
		listnew.add(2);
		
		
		list.add(listnew);
		
		System.out.println(list);
		

	}

}
