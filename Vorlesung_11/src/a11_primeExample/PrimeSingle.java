package a11_primeExample;

public class PrimeSingle {

	public static void main(String[] args) {
		for (int i = 3; i <= 800000; i+=2) {
			if (isPrime(i)) {
				//System.out.println(i);
			}
		}
	}
	
	public static boolean isPrime(int toTest) {
		if (toTest == 2) {
			return true;
		}
		for (int n = 3; n < toTest; n += 2) {
			if (toTest % n == 0) {
				return false;
			}
		}
		return true;
	}
}
