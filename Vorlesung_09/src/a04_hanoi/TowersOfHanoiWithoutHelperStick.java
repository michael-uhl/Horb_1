package a04_hanoi;

public class TowersOfHanoiWithoutHelperStick {
	public static void main(String[] args) {
		int turmhoehe = 15;
		final int STAB_START = 1;
		final int STAB_HELFER = 2;
		final int STAB_ZIEL = 3;
		
		bewegeTurm(turmhoehe, STAB_START, STAB_ZIEL, STAB_HELFER);
	}
	
	static void bewegeTurm(int scheiben, int vonStab, int nachStab, int helferStab) {
		if (scheiben > 0) {
			bewegeTurm(scheiben - 1, vonStab, helferStab, nachStab);
			System.out.println("Bewege Scheibe von " + vonStab + " nach " + nachStab +".");
			bewegeTurm(scheiben - 1, helferStab, nachStab, vonStab);
		}
	}
}
