public class DoWhileLoop {
	public static void main(String[] args) {
		String text = "hallo"; //Was passiert, wenn text = ""?

		do {
			System.out.println("'" + text + "'");
			if (!text.isEmpty()) {
				text = text.substring(1);
			}
		} while (!text.isEmpty());
	}
}
