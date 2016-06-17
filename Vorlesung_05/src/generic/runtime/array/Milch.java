package generic.runtime.array;

public class Milch extends Fluessigkeit {
	
	public Milch() {
		super();
	}

	@Override
	public Milch entleeren() {
		System.out.println("Milch fliesst raus.");
		return this;
	}

} 
