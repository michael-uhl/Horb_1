package a04_hanoi;

public class TowersOfHanoi {
	public static void main(String[] args) {
		int turmhoehe = 3;
		final int STAB_START = 1;
		final int STAB_ZIEL = 3;
		
		bewegeTurm(turmhoehe, STAB_START, STAB_ZIEL);
	}
	
	static void bewegeTurm(int scheiben, int vonStab, int nachStab) {
		if (scheiben > 0) {
			int helferStab = 6 - vonStab - nachStab;
			bewegeTurm(scheiben - 1, vonStab, helferStab);
			System.out.println("Bewege Scheibe von " + vonStab + " nach " + nachStab +".");
			bewegeTurm(scheiben - 1, helferStab, nachStab);
		}
	}
}
