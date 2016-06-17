
public class Bereichsuerberschreitung {

	public static void main(String[] args) {
		int x = 2147483647;
		x = x + 1;
		System.out.println(x); // Überlauf wird nicht erkannt

		Double d = 1e308; //10 hoch 308
		d = d + d;
		//d = d - d - d -d;
		System.out.println(d); // Überlauf wird erkannt
		
	}
}
