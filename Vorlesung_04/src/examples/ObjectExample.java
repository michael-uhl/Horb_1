package examples;


public class ObjectExample {
	public static void main(String[] args) {
		String example = "Hallo Welt.";
		Object o = example;
		
		if (o instanceof String) {
			String example2 = (String) o;
			System.out.println(example2);
		}
	}
}
