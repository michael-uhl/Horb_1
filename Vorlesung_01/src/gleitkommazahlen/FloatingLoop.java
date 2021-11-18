package gleitkommazahlen;

public class FloatingLoop {
	private final static double EPSILON = 0.00001;

	public static void main(String[] args) {
//		for (float i = 0.0f; i != 1.0f; i+=0.1f) {
//			System.out.println(i);
//			if (i > 2.0f) {
//				break;
//			}
//		}

		for (float j = 0.0f; 1.0f - j > EPSILON; j+=0.1f) {
			System.out.println(j);
		}
	}
}
