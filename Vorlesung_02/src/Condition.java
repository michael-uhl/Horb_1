
public class Condition {
	public static void main (String[] args) {
		if (eins() | zwei()) {
			System.out.println("Ausgabe");
		}
	}
	
	public static boolean eins() {
		System.out.println("eins");
		return true;
	}
	
	public static boolean zwei() {
		System.out.println("zwei");
		return true;
	}	
}
