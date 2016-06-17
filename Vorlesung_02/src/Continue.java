
public class Continue {
	
	public static void main(String[] args) {
		int erg = 0;
		for(int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				continue;
			}
			erg = erg + 1;
		}
		System.out.println(erg);
	}
}