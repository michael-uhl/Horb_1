package a01_definitionRekursion;

public class Verschachtelt {
	public static void main(String[] args) {
		f(5);
	}
	
	public static int f(int n) {
		if (n == 0) {
			return 0;
		}
		
		System.out.println(n);
		return f(f(n-1));
	}	
}
