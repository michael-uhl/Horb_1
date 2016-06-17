package gleitkommazahlen;

public class Assoziativgesetz {
	public static void main(String args[]) {
		float a = 2.8788f;
		float b = 0.711f;
		float c = 2.5286f;
		float x = a + b + c; // 6.1183996
		float y = a + c + b; // 6.1184
		System.out.println("x="+x);
		System.out.println("y="+y);
	}
}
