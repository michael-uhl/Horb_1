
public class EuklidKlassischRekursiv {
	public static void main(String[] args) {
		System.out.println(ggT(1029,1071));
		System.out.println(ggT(1071,1029));
	}

	public static long ggT(long a, long b) {
		if (b == 0) {
			return a;	
		} else if (a == 0) {
			return b;	
		} else if (a > b) {
			return ggT(a - b, b);
		} else {
			return ggT(a,b - a);			
		}
	}
}
