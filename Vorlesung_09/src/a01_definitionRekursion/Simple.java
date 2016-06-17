package a01_definitionRekursion;

public class Simple {
	
	public static void main(String[] args) {
		countHead(5);
		System.out.println();
		countTail(5);
	}
	
	public static void countTail(int n) {
		System.out.println(n);
		
		if (n == 0) {
			return;
		}
		
		countTail(n-1);
	}
	
	public static void countHead(int n) {
		
		if (n == 0) {
			return;
		}
		
		countHead(n-1);
		
		System.out.println(n);
	}	

}
