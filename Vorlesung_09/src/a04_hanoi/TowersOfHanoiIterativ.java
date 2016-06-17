package a04_hanoi;

public class TowersOfHanoiIterativ {
	private static int n = 0;
	public static void main(String[] args) {
		n = 10;
		int limit = (1 << n) - 1; // number of iterations = 2^n - 1
		for (int i = 0; i < limit; i++) {
			int d = disk(i); // disk to be moved
			int source = (movements(i, d) * direction(d)) % 3; // tower it is
																// currently
																// occupying
			int dest = (source + direction(d)) % 3; // tower to move it to
			out(d, source, dest);
		}
	}

	// disk that will be moved in step i
	static int disk(int i) {
		int g, x = i + 1;
		for (g = 0; x % 2 == 0; g++)
			x /= 2;
		return g;
	}

	// how many times disk d is moved before stage i
	static int movements(int i, int d) {
		return ((i >> d) + 1) >> 1;
	}

	// disk d always moves in the same direction
	// clockwise=1, counterclockwise=2
	static int direction(int d) {
		return 2 - (n + d) % 2;
	}

	static void out(int d, int source, int dest) {
		System.out.println("Moving disk " + (d+1) + " from tower " + source
				+ " to tower " + dest);
	}
}
