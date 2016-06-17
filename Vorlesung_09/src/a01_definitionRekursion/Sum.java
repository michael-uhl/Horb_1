package a01_definitionRekursion;

public class Sum {
	public static void main(String args[]) {
		System.out.println(sum(10));
	}
	
	public static int sum(int i) {
		if (i == 0) {
			return 0;
		}
		
		return  i + sum(i-1);
	}
}
