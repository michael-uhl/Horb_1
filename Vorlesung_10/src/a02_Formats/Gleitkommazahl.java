package a02_Formats;

import java.util.Locale;

public class Gleitkommazahl {
	public static void main(String ... args) {
		System.out.printf("Gleitkommazahl als Dezimalzahl: %f%n", 1.8);
		
		System.out.printf("Gleitkommazahl in Expionentialschreibweise: %e%n", 1.8);
		System.out.printf("Gleitkommazahl in Expionentialschreibweise: %e%n", 18.0);
		
		System.out.printf("Gleitkommazahl als gerundete Dezimalzahl: %.2f%n", 1.8);
		System.out.printf("Gleitkommazahl als gerundete Dezimalzahl: %.2f%n", 61.8);
		System.out.printf("Gleitkommazahl als gerundete Dezimalzahl: %.0g%n", 1.8);
		System.out.printf("Gleitkommazahl als gerundete Dezimalzahl: %.0f%n", 1.8);
		
		System.out.printf("Formatiert: %,.2f%n", 1234567.89);
		System.out.printf(Locale.US,"Formatiert: %,.2f%n", 1234567.89);
		System.out.printf(Locale.FRENCH,"Formatiert: %,.2f%n", 1234567.89);
	}
}
