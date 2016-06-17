package a04_hanoi;

public class TowersOfHanoiAbstieg {
	public static void main(String[] args) {
		int turmhoehe = 3;
		final int STAB_START = 1;
		final int STAB_ZIEL = 3;
		
		bewegeTurm(turmhoehe, STAB_START, STAB_ZIEL, 0);
	}
	
	static void bewegeTurm(int scheiben, int vonStab, int nachStab, int level) {
//		printLevel(level, "bewegeTurm("+scheiben+", "+vonStab+", "+nachStab+", "+level+")");
		printLevel(level, "bewegeTurm("+scheiben+", "+vonStab+", "+nachStab+")", scheiben);
		if (scheiben > 0) {
//			printLevel(level, "hoehe "+scheiben+" ist > 0 ==> weiter");
			int helferStab = 6 - vonStab - nachStab;
			level++;
			bewegeTurm(scheiben - 1, vonStab, helferStab, level);
			level--;
			printLevel(level, "bewege(" + vonStab + "," + nachStab +")");
			level++;
			bewegeTurm(scheiben - 1, helferStab, nachStab, level);
			level--;
		}
//		printLevel(level, "hoehe ist 0 ==> Abbruch");
	}
	
	static void printLevel(int level, String message) {
		for (int i = 0; i < level*3; i++) {
			System.out.print(" ");
		}
		System.out.println(message);
	}
	
	static void printLevel(int level, String message, int scheiben) {
		for (int i = 0; i < level*3; i++) {
			System.out.print(" ");
		}
		System.out.print(message);
		
		System.out.print(" ");
		
		if (scheiben == 0) {
			System.out.println("hoehe ist 0 ==> Abbruch");
		} else {
			System.out.println("hoehe ist > 0 ==> Weiter");
		}
		
	}
	
}
