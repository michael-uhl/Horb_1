package p4;

public class Konto {
	private double betrag = 0.0;
	
	public void einzahlen(double rein) {
		betrag = betrag + rein;
	}
	
	public double auszahlen(double raus) {
		betrag = betrag - raus;
		return raus;
	}
}
