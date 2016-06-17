package a02_fakultaet;

public class FacIter {
	public static void main(String[] args) {
		System.out.println(fact(3,3));
	}

	public static long fact(long n, long m) {
		long h = 1;
		while (n != 0) {
			h = n * h;
			n = n - 1;
		}
		return h; 
	}
}
