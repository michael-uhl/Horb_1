package examples;

import java.util.Scanner;

public class BruchLoesung2 {
	private int zaehler;
	private int nenner;

	public BruchLoesung2() {
		this.zaehler = 1;
		this.nenner = 1;
		this.kuerzen();
	}

	public BruchLoesung2(int zaehler, int nenner) {
		this.zaehler = zaehler;
		if (nenner != 0) {
			this.nenner = nenner;
		} else {
			// Fehlerfall; wie man dies korrekt behandelt folgt spaeter
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
	public static String vergleichen (int zahler1, int nenner1, int zahler2, int nenner2) {
		if(zahler1/nenner1 == zahler2/nenner2){
			if(zahler1%nenner1 == zahler2%nenner2){
				return "Beide Brüche sind gleich groß.";
			}
			else{
				if(zahler1%nenner1 > zahler2%nenner2){
					return "Der erste Bruch ist größer.";
				}
				else{
					return "Der zweite Bruch ist größer.";
				}
			}
		}
		else{
			if(zahler1/nenner1 > zahler2/nenner2){
				return "Der erste Bruch ist größer.";
			}
			else{
				return "Der zweite Bruch ist größer.";
			}
		}
	}
	
	public int getZahler(){
		return this.zaehler;
	}
	
	public int getNenner(){
		return this.nenner;
	}

	public static void main(String[] args) throws Exception {
		Scanner ScanIn = new Scanner(System.in);
		while(true){
			int eingabe1;
			int eingabe2;
			int eingabe3;
			int eingabe4;
			System.out.println("Geben Sie den Zähler des ersten Bruches an.");
			eingabe1 = ScanIn.nextInt();
			System.out.println("Geben Sie den Nenner des ersten Bruches an.");
			eingabe2 = ScanIn.nextInt();
			System.out.println("Geben Sie den Zähler des zweiten Bruches an.");
			eingabe3 = ScanIn.nextInt();
			System.out.println("Geben Sie den Nenner des zweiten Bruches an.");
			eingabe4 = ScanIn.nextInt();
			BruchLoesung2 ersterBruch = new BruchLoesung2(eingabe1, eingabe2);
			BruchLoesung2 zweiterBruch = new BruchLoesung2(eingabe3, eingabe4);
			eingabe1 = ersterBruch.getZahler();
			eingabe2 = ersterBruch.getNenner();
			eingabe3 = zweiterBruch.getZahler();
			eingabe4 = zweiterBruch.getNenner();
			System.out.println("Der erste Bruch gekürtzt lautet: " + eingabe1 + "/" + eingabe2);
			System.out.println("Der zweite Bruch gekürtzt lautet: " + eingabe3 + "/" + eingabe4);
			System.out.println(vergleichen(eingabe1, eingabe2, eingabe3, eingabe4));
		}
	}
}
