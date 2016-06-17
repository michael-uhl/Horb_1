package gleitkommazahlen;

public class Overvlow {
	public static void main(String args[]) {
		byte b1 = 110;
		byte b2 = 18;
		byte b3 = (byte)(b1 + b2);
		//System.out.println(b3);
		
		int i2 = 2147483647;
		//dSystem.out.println(i2 + i2);
		
		int x = 2147483647;
		x = x + 1;
		//System.out.println(x); // Überlauf wird nicht erkannt
		
		double d = 1e308; //10 hoch 308
		d = d + d;
		System.out.println(d); // Überlauf wird erkannt
		

	}
}
