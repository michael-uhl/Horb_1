import java.util.Date;

public class PrimeFactors {

    /**
     * Berechnet die Primfaktoren, aus denen sich die Zahl n zusammensetzt.
     * Multipliziert man diese, ergibt sich die Zahl.
     * Zurückgegeben werden die Zahlen in einem Array, das soviele Elemente
     * hat wie n Primfaktoren. Sie sind aufsteigend sortiert.
     *
     * @param n Die zu zerlegende Zahl
     * @return Die Primfaktoren in einem Array
     */
    public static long[] primeFactors (long n) {

        /*
         * Die Vorgehensweise ist folgende:
         * Aufgrund der Vorgabe, dass das zurückgegebene Array maximal
         * soviele Elemente haben darf wie die Zahl n Primfaktoren hat,
         * erzeugen wir zunächst ein "temporäres" Array tmp, dessen
         * Länge durch maxFactors angegeben wird. Dies geschieht aus
         * einer Überlegung zum Speicherverbrauch:
         * Man könnte tmp auch mit der Länge n initialisieren, allerdings
         * ist dies aus Effizienzgesichtspunkten eher suboptimal,
         * da jede Zahl maximal eine gewisse Anzahl an Primfaktoren haben
         * kann.
         * Da 2 der kleinstmögliche Primfaktor ist, ist die Anzahl der
         * Primfaktoren immer kleiner gleich dem Exponenten der nächst-
         * höheren Zweierpotenz.
         * Daraus folgt:
         *     n  <= 2^x
         * log(n) <= log (2^x)
         *     x  >= log (n) / log(2)
         * Mit x als maximaler Anzahl der Primfaktoren der Zahl n.
         */

        // Maximale Faktoranzahl ermitteln
        int maxFactors = (int) Math.ceil(Math.log10(n)/Math.log10(2));

        // Temporäres Array erzeugen
        long[] tmp = new long[maxFactors];

        // Zähler der tatsächlichen Faktoranzahl initialisieren
        int anzahlFaktoren = 0;

        /*
         * Jetzt kommt der Trick der Zerlegung:
         * In einer Zählschleife wird wiederholt von 2 (kleinster Primfaktor)
         * bis n (Zahl) gezählt, wobei bei jedem Durchlauf überprüft wird, ob
         * die Zählvariable ganzzahliger Teiler der Zahl ist. Ist dies der
         * Fall, ist ein neuer Primfaktor gefunden.
         * Dieser wird in tmp gesichert, und die ganze Schleife wird
         * "zurückgesetzt", indem der Zähler erneut bei 2 (1++) beginnt und
         * n durch n/Primfaktor ersetzt wird.
         */
		for (long j = 2; j <= n; j++ ) {
		    // Ist j Primfaktor?
		    if (n % j == 0) {
		        // Primfaktor sichern und Anzahl der Primfaktoren erhöhen
		        tmp[anzahlFaktoren++] = j;
		        // n ändern
		        n = n/j;
		        // j erneut auf Startwert 2 (1++) setzen
		        j = 1;
		    }
		}
        // Rückgabearray erzeugen, mit Länge der tatsächlichen Anzahl
        // von Primfaktoren
        long[] prf = new long[anzahlFaktoren];
        // Überführen der Werte des temporären Arrays in das
        // Rückgabearray
        for (int i = 0; i < anzahlFaktoren; i++) {
            prf[i] = tmp[i];
        }
        // Rückgabe
        return prf;
    }

    public static void main (String[] args) {
    	/*
        if (args.length < 1) {
            System.out.println("Verwendung: java PrimeFactors ");
            System.exit(1);
        }
        // Übergebenes Argument in Long casten
        long n = Long.parseLong(args[0]);
        // Primfaktoren ermitteln
        long[] prime = primeFactors(n);
        // Primfaktoren ausgeben
        for (int i = 0; i < prime.length; i++) {
            System.out.print(prime[i] + " ");
        }
        */
    	long maxTimeCycle = 0;
    	for(int n = 1; n <= 1000000000; n++) {
    		Date start = new Date();
    		//for (int i = 0; i < 1000; i++) {
    			primeFactors(n);
    		//}
    		Date end = new Date();
    		long curTimeCycle =  end.getTime() - start.getTime();
    		maxTimeCycle = (curTimeCycle > maxTimeCycle) ? curTimeCycle : maxTimeCycle;
    		System.out.println((n) + "," + curTimeCycle + "," + maxTimeCycle);
    	}
    }
}