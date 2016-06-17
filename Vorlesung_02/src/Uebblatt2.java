
public class Uebblatt2 {
	
	public static void main(String[] args) {
		int ergebnis = 1;
		int anzahl = 5;
		
		do {
			ergebnis = ergebnis * 2;
			if (ergebnis > 10) {
				ergebnis = ergebnis - anzahl;
				anzahl--;
			}
		} while (anzahl > 0);
		
		System.out.println("Das ergebnis ist " + ergebnis);
	}	
}
