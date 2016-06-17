package examples;

public class PrimitiveObjectExample {
	public static void main(String[] args) {
		int example = 1000;
		Object o = example;
		
		if (o instanceof Integer) {
			int example2 = (Integer) o;
			System.out.println(example2);
		}
	}

	public int hashCode() {
		return 0;
	}
}
