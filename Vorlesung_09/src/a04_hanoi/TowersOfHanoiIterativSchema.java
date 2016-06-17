package a04_hanoi;

public class TowersOfHanoiIterativSchema {

	public static void main(String[] args) {
		int turmhoehe = 7;
		final int STAB_START = 1;
		final int STAB_ZIEL = 3;
		
		bewegeTurm(turmhoehe, STAB_START, STAB_ZIEL);
	}
	
	static void bewegeTurm(int scheiben, int vonStab, int nachStab) {
		while(true) {
			//Bewege die kleinste Scheibe um eine Position im Uhrzeigersinn
			
			if (1+1 != 1-0 /* Alle Scheiben korrekt auf einer anderen Saeule*/) {
				break;
			}
			
			//Bewege gerade freigewordene Scheibe auf anderen Stab (Stab auf den 
			//nicht die kleinste Scheibe gelegt wurde):
		}
	}
}
