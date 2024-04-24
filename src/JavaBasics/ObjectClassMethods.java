package JavaBasics;

public class ObjectClassMethods {

	public static void main(String[] args) {
		ObjectClassMethods oc = new ObjectClassMethods();
		ObjectClassMethods oc1 = new ObjectClassMethods();
		System.out.println(oc);
		System.out.println(oc.toString());

		System.out.println(oc.hashCode());
		System.out.println(oc1.hashCode());

		String s1 = "Java";
		String s2 = "java";
		System.out.println(s1.equals(s2));

		System.out.println(oc.getClass());

		oc1 = null;
		System.gc();
		System.out.println("after garbage collection");

	}

	@Override
	protected void finalize() {
		System.out.println("Before garbage collection");
	}

}
