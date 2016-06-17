public class EuklidKlassisch {

	public static void main(String[] args) {
		System.out.println(ggT(1029,1071));
		System.out.println(ggT(1071,1029));
	}

	public static long ggT(long a, long b) {
		if (a == 0) {
			return b;	
		} else {
			while (b != 0)
				if (a > b)
					a = a - b;
				else
					b = b - a;			
		}

		return a;
	}
}
