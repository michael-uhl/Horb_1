
public class Stringfunktionen {
	public static void main(String[] args) {
		  String test = "unhappy"; 
		  
		  char c = test.charAt(3); // 'a', Ermittelt Zeichen an Pos. 3
		  String t2 = "un".concat("happy"); // �unhappy� wie �+�
		  boolean b1 = test.contains("nha"); // Beinhaltet String test �un�?
		  boolean eq = test.equals("happy"); // false, pr�ft auf Gleichheit, kein ==
		  boolean em = test.isEmpty(); // false, pr�ft auf Leerstring 
		  int length = test.length(); // Länge des Strings
		  boolean start = test.startsWith("un"); // true, prüft ob String mit �un� anf�ngt
		  boolean end = test.endsWith("y"); // true, pr�ft ob String mit �y� aufh�rt
		  int indexOfP = test.indexOf("p"); // Ergibt 4. Gibt 1. Vorkommen von �p� an.
		  int lastIndexOfP = test.lastIndexOf("p"); // Ergibt 5. Letztes Vorkommen von �p�.
		  String begin = test.substring(2); // �happy" schneidet 2 weg.
		  String ts = test.substring(0,2); // �un� Teilstring von 2 bis 6 
		  String res = test.replace("app","ol"); // Ersetzt �app� mit �ol�  
		  String upper = test.toUpperCase(); // �UNHAPPY�, zu Gro�buchstaben 
		  String lower = test.toLowerCase(); //�unhappy�, zu Kleinbuchstaben
		  
		  System.out.println("test=\"" + test + "\"");
		  System.out.println("test.charAt(3)\t\t Erwartet: a\t\t" + "Ergebnis: " + c);
		  System.out.println("\"un\".concat(\"happy\")\t Erwartet: unhappy\t" + "Ergebnis: " + t2);
		  System.out.println("test.contains(\"nha\")\t Erwartet: true\t\t" + "Ergebnis: " + b1);
		  System.out.println("test.equals(\"happy\")\t Erwartet: false\t" + "Ergebnis: " + eq); 
		  System.out.println("test.isEmpty()\t\t Erwartet: false\t" + "Ergebnis: " + em); 
		  System.out.println("test.length()\t\t Erwartet: 7\t\t" + "Ergebnis: " + length); 
		  System.out.println("test.startsWith(\"un\")\t Erwartet: true\t\t" + "Ergebnis: " + start); 
		  System.out.println("test.endsWith(\"y\")\t Erwartet: true\t\t" + "Ergebnis: " + end);
		  System.out.println("test.indexOf(\"p\")\t Erwartet: 4\t\t" + "Ergebnis: " + indexOfP);
		  System.out.println("test.lastIndexOf(\"p\")\t Erwartet: 5\t\t" + "Ergebnis: " + lastIndexOfP);
		  System.out.println("test.substring(2)\t Erwartet: happy\t" + "Ergebnis: " + begin);
		  System.out.println("test.substring(0,2)\t Erwartet: un\t\t" + "Ergebnis: " + ts);
		  System.out.println("test.replace(\"app\",\"ol\") Erwartet: unholy\t" + "Ergebnis: " + res);
		  System.out.println("test.toUpperCase()\t Erwartet: UNHAPPY\t" + "Ergebnis: " + upper);
		  System.out.println("test.toLowerCase()\t Erwartet: unhappy\t" + "Ergebnis: " + lower);

		  
	}
}
