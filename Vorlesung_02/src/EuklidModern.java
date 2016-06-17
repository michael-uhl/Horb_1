public class EuklidModern {

	public static void main(String[] args) {
		System.out.println(ggT(1029, 1071));
		System.out.println(ggT(1071, 1029));
	}

	public static long ggT(long a, long b) {

		while (b != 0 && a != 0)
			if (a > b)
				a = a % b;
			else
				b = b % a;

		if (b== 0)
			return a;
		else 
			return b;
	}

}
