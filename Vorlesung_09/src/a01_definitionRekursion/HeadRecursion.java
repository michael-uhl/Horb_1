package a01_definitionRekursion;

public class HeadRecursion {
	public static void main(String args[]) {
		System.out.println(sum(5));
	}
	
	public static int sum(int i) {

		if (i > 0) {
			return i + sum(i-1);
		}
		
		return 0;
	}
}
