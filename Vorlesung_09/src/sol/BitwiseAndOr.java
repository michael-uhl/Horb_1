package sol;

public class BitwiseAndOr {

	public static void main(String[] args) {
		int five = 5;
		int zero = 0;

		int orResult = five | zero;  // 0000..101 | 0000...000
		int andResult = five & five; // 0000..101 | 0000...101

		System.out.println("orResult = " + orResult);
		System.out.println("andResult = " + andResult);
	}
}
