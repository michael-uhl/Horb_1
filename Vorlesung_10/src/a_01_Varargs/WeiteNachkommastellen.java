package a_01_Varargs;

public class WeiteNachkommastellen {
	public static void main(String ... args) {
		System.out.printf("%10.3f%n" , 123.456);
		System.out.printf("%10.4f%n" , 123.456);
		System.out.printf("%10.2f%n" , 123.456);
		System.out.printf("%10.1f%n" , 123.456);
		System.out.printf("%8.3f%n", 123.456);
		System.out.printf("%.10f%n", 123.456);
	}
}
