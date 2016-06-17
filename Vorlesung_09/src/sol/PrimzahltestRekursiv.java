package sol;

public class PrimzahltestRekursiv {

	public static void main(String[] args) {
		System.out.println(primzahl(73));
		System.out.println(primzahl(100));
	}
	
	public static boolean primzahl(int n) {
		return primzahl(n, n-1);
	}
	
	public static boolean primzahl(int p, int z)
    {
		if (z == 1) 
			return true;
		if (p % z == 0) 
			return false;
		else
			return primzahl(p, z-1);
    }
}
