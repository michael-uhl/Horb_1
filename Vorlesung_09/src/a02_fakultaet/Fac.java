package a02_fakultaet;

public class Fac {
	public static void main(String[] args) {
		System.out.println(fact(5));
	}

	public static long fact(long n) {
		if (n == 0) {
			return 1;
		}
		
		return n * fact(n-1);
	}
}
