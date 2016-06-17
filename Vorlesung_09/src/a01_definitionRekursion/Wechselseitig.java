package a01_definitionRekursion;

public class Wechselseitig {
	public static void main(String[] args) {
		for(int i = 0; i <= 100; i++) {
			f(i);
		}
	}
	
	public static void f(int n) {
		if (n <= 0) {
			System.out.println("Abbruch in f, Wert:"+n);
			return;
		}
		g(n+1);
	}
	
	public static void g(int n) {
		if (n <= 0) {
			System.out.println("Abbruch in g, Wert:"+n);
			return;
		}
		f(n-2);
	}
	
}
