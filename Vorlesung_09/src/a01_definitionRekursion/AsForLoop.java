package a01_definitionRekursion;


public class AsForLoop {
	public static void main(String args[]) {
		System.out.println(sum(10));
	}
	
	public static int sum(int n) {
		int retVal = 0;
		for (int i = n; i > 0; i--) {
			retVal = retVal + i;
		}
		
		return  retVal;
	}
}
