package examples;

public class GetClassExample {
	public static void main(String[] args) {
		String example = "Hallo Welt.";
		Object o = example;
		
		if (o instanceof String) {
			System.out.println(o.getClass());
			String example2 = (String) o;
			System.out.println(example2.getClass());
		}
	}
}
