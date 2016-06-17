package a03_fibunacci;

public class Fibunacci {
	public static void main(String[] args) {
		System.out.println(fib(0));
		System.out.println(fib(1));
		System.out.println(fib(2));
		System.out.println(fib(3));
		System.out.println(fib(4));
		System.out.println(fib(5));
		System.out.println(fib(6));
		System.out.println(fib(7));
	}

	public static long fib(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1)
			return 1;
		else
			return fib(n - 1) + fib(n - 2);
	}
	
	public static long fibIter(int n) {
		if (n == 0) {
			return 0;
		}
		
		long a = 0;
		long b = 1;
		long fibo = 1;
		
		for (int i = 2; i < n; i++) {
			fibo = a + b;
			a = b;
			b = fibo;
		}
		
		return fibo;
	}	
}
