public class WhileLoop {
	public static void main(String[] args) {
		String text = "hallo";

		while (!text.isEmpty()) {
			System.out.println("'" + text + "'");
			text = text.substring(1);
		}
	}
}
