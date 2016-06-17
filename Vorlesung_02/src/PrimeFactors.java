import java.util.Date;

public class PrimeFactors {

    /**
     * Berechnet die Primfaktoren, aus denen sich die Zahl n zusammensetzt.
     * Multipliziert man diese, ergibt sich die Zahl.
     * Zur�ckgegeben werden die Zahlen in einem Array, das soviele Elemente
     * hat wie n Primfaktoren. Sie sind aufsteigend sortiert.
     *
     * @param n Die zu zerlegende Zahl
     * @return Die Primfaktoren in einem Array
     */
    public static long[] primeFactors (long n) {

        /*
         * Die Vorgehensweise ist folgende:
         * Aufgrund der Vorgabe, dass das zur�ckgegebene Array maximal
         * soviele Elemente haben darf wie die Zahl n Primfaktoren hat,
         * erzeugen wir zun�chst ein "tempor�res" Array tmp, dessen
         * L�nge durch maxFactors angegeben wird. Dies geschieht aus
         * einer �berlegung zum Speicherverbrauch:
         * Man k�nnte tmp auch mit der L�nge n initialisieren, allerdings
         * ist dies aus Effizienzgesichtspunkten eher suboptimal,
         * da jede Zahl maximal eine gewisse Anzahl an Primfaktoren haben
         * kann.
         * Da 2 der kleinstm�gliche Primfaktor ist, ist die Anzahl der
         * Primfaktoren immer kleiner gleich dem Exponenten der n�chst-
         * h�heren Zweierpotenz.
         * Daraus folgt:
         *     n  <= 2^x
         * log(n) <= log (2^x)
         *     x  >= log (n) / log(2)
         * Mit x als maximaler Anzahl der Primfaktoren der Zahl n.
         */

        // Maximale Faktoranzahl ermitteln
        int maxFactors = (int) Math.ceil(Math.log10(n)/Math.log10(2));

        // Tempor�res Array erzeugen
        long[] tmp = new long[maxFactors];

        // Z�hler der tats�chlichen Faktoranzahl initialisieren
        int anzahlFaktoren = 0;

        /*
         * Jetzt kommt der Trick der Zerlegung:
         * In einer Z�hlschleife wird wiederholt von 2 (kleinster Primfaktor)
         * bis n (Zahl) gez�hlt, wobei bei jedem Durchlauf �berpr�ft wird, ob
         * die Z�hlvariable ganzzahliger Teiler der Zahl ist. Ist dies der
         * Fall, ist ein neuer Primfaktor gefunden.
         * Dieser wird in tmp gesichert, und die ganze Schleife wird
         * "zur�ckgesetzt", indem der Z�hler erneut bei 2 (1++) beginnt und
         * n durch n/Primfaktor ersetzt wird.
         */
		for (long j = 2; j <= n; j++ ) {
		    // Ist j Primfaktor?
		    if (n % j == 0) {
		        // Primfaktor sichern und Anzahl der Primfaktoren erh�hen
		        tmp[anzahlFaktoren++] = j;
		        // n �ndern
		        n = n/j;
		        // j erneut auf Startwert 2 (1++) setzen
		        j = 1;
		    }
		}
        // R�ckgabearray erzeugen, mit L�nge der tats�chlichen Anzahl
        // von Primfaktoren
        long[] prf = new long[anzahlFaktoren];
        // �berf�hren der Werte des tempor�ren Arrays in das
        // R�ckgabearray
        for (int i = 0; i < anzahlFaktoren; i++) {
            prf[i] = tmp[i];
        }
        // R�ckgabe
        return prf;
    }

    public static void main (String[] args) {
    	/*
        if (args.length < 1) {
            System.out.println("Verwendung: java PrimeFactors ");
            System.exit(1);
        }
        // �bergebenes Argument in Long casten
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