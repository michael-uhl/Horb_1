package a_01_Varargs;

public class PrintF {
	
	public static void main(String ... args) {
		System.out.printf("String: %s%n", "Programmieren macht Spaß.");
		System.out.printf("Dies %seine%s%n", "ist ", " Zeile!");
		System.out.printf("Total is: %,.2f€.%n", 5.1);
		System.out.printf("Wert:%1$-10s", "hi");
		
		
	}

}
