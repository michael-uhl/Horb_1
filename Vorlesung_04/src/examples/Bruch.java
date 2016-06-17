package examples;

public class Bruch implements Comparable<Bruch>{

	int zaehler;
	int nenner;

	public Bruch() {
		this.zaehler = 1;
		this.nenner = 1;
		this.kuerzen();
	}

	public Bruch(int zaehler, int nenner) {
		this.zaehler = zaehler;
		if (nenner != 0) {
			this.nenner = nenner;
		} else { // Fehlerfall; wie man dies korrekt behandelt folgt spaeter
			this.nenner = 1;
		}
		this.kuerzen();
	}
	
	

	private int abs(int zahl) {
		if (zahl >= 0)
			return zahl;
		return -1 * zahl;
	}

	private int ggt(int zahl1, int zahl2) {
		if (zahl1 >= zahl2) {
			if (zahl1 % zahl2 == 0)
				return zahl2;
			else
				return ggt(zahl2, zahl1 - zahl2);
		} else
			return ggt(zahl2, zahl1);
	}

	private void kuerzen() {
		if (this.zaehler == 0) {
			this.nenner = 1;
			return;
		}
		int kuerz_faktor = ggt(abs(this.zaehler), abs(this.nenner));
		this.zaehler /= kuerz_faktor;
		this.nenner /= kuerz_faktor;
		if (this.zaehler < 0) {
			this.zaehler = -this.zaehler;
			this.nenner = -this.nenner;
		}
	}
	
	

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Bruch) {
			Bruch bruchObj = (Bruch)obj;
			return (bruchObj.nenner == this.nenner) && 
				(bruchObj.zaehler == this.zaehler);
 		} else {
			return false;
		}
	}

	
	@Override
	public int compareTo(Bruch o) {
		if (this == o) {
			return 0;
		}
		if (this.equals(o)) {
			return 0;
		}
		
		if ((double)o.zaehler/(double)o.nenner > 
				(double)this.zaehler / (double)this.nenner) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		Bruch b1 = new Bruch(1,2);
		Bruch b2 = new Bruch(3,4);
		Bruch b3 = new Bruch(1,2);
		
		BeispielBruch b4 = new BeispielBruch();

		if (b4 instanceof Bruch) {
			
		}
		
		if (b4.getClass().equals(Bruch.class)) {
			
		} else {
			
		}
		
		System.out.println(b1.compareTo(b1));
		System.out.println(b1.equals(b3));
	}
}