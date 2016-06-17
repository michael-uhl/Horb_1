package a01_definitionRekursion;

public class Compound {
	public static void main(String[] args) {
		f(5);
		System.out.println();
		f(6);
		System.out.println();
		f(9);
		System.out.println();
		f(11);
		System.out.println();
		f(12);
		System.out.println();
		f(14);
		System.out.println();
		f(15);
		System.out.println();
		f(18);
		System.out.println();
		f(19);
	}
	
	public static int f(int n) {
		System.out.println(n);
		if ((n % 3) == 0) {
			return n/3;
		} else {
			return f(f((3*n)/3 + 4));
		}
	}	
}
