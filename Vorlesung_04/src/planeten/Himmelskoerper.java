package planeten;

public class Himmelskoerper implements Cloneable {
	
	private Object mond;
	private Object sonne;
	
	public Himmelskoerper() {
		this.mond =  new Object();
		this.sonne = new Object();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Himmelskoerper cloned = (Himmelskoerper)super.clone();
		cloned.mond = new Object();
		return cloned;
	}

	public static void main(String[] args) throws Exception {
		Himmelskoerper erde = new Himmelskoerper();
		Himmelskoerper mars = (Himmelskoerper)erde.clone();
		
		System.out.println(erde.sonne == mars.sonne);
		System.out.println(erde.mond == mars.mond);
	}
}
