package a02_Formats;

public class Ganzzahl {
	public static void main(String ... args) {
		System.out.printf("Diese Zahl ist 12: %d.%n", 12);
		System.out.printf("Diese Zahl ist 12: %x.%n", 12);
		System.out.printf("Diese Zahl ist 12: %o.%n", 12);
		
		System.out.printf("Diese Zahl ist gro§: %d.%n", 3000000000l);
	}
}
