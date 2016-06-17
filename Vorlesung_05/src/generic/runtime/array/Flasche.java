package generic.runtime.array;

public class Flasche<T extends Fluessigkeit> {
	T inhalt;
	
	public Flasche(T neuerInhalt) {
		inhalt = neuerInhalt;
	}
	
	public Fluessigkeit entleeren() {
		System.out.println("Inhalt auf Flasche raus.");
		return inhalt.entleeren();
	}
}
