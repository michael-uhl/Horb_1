public class GgT {

	public static int ggtKlassischRekursiv(int a, int b) {
		if (a <= 0 || b <= 0) {
			return 0;
		} else {
			if (a == b) {
				return a;
			} else {
				if (a > b) {
					return ggtKlassischRekursiv(b, a);
				} else {
					return ggtKlassischRekursiv(a, b - a);
				}
			}
		}
	}

	public static int ggtKlassisch(int a, int b) {
		if (a == 0) {
			return b;
		} else {
			while (b != 0) {
				if (a > b) {
					a = a - b;
				} else {
					b = b - a;
				}
			}
		}
		return a;
	}
	
	public static int ggTModernRekursiv(int a, int b) {
		if (b == 0) {
			return a;
		} else if (a == 0) {
			return b;
		} else if (a > b) {
			return ggTModernRekursiv(a % b, b);
		} else
			return ggTModernRekursiv(a, b % a);
	}

	public static int ggTModern(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			while (b != 0 && a != 0) {
				if (a > b) {
					a = a % b;
				} else {
					b = b % a;
				}
			}
		}
		return a + b ;
	}

	public static int ggtModern2(int a, int b) {
		int tmp = 0;
		while (b != 0) {
			tmp = a % b;
			a = b;
			b = tmp;
		}
		return a;
	}
	
	public static void main(String arg[]) {
		System.out.println(ggtKlassischRekursiv(100, 55));
		System.out.println(ggtKlassischRekursiv(55,100));
		System.out.println(ggtKlassisch(100, 55));
		System.out.println(ggtKlassisch(55, 100));
		System.out.println(ggTModernRekursiv(100, 55));
		System.out.println(ggTModernRekursiv(55, 100));
		System.out.println(ggTModern(100,55));
		System.out.println(ggTModern(55,100));
		System.out.println(ggtModern2(100,55));
		System.out.println(ggtModern2(55,100));
	}
}
