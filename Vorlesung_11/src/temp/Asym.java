package temp;

public class Asym {
	
	public static void main(String ...strings) {
		int i = Integer.MIN_VALUE;
		
		if (i == -i) {
			System.out.println("Hello crazy World.");
		}
		
		if (Math.abs(i) == -Math.abs(-i)) {
			System.out.println("Hello absolute crazy World.");
		}
	}

}
