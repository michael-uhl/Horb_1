package generic.runtime.array;

public class Wasser extends Fluessigkeit {

	@Override
	public Wasser entleeren() {
		System.out.println("Wasser fliesst raus.");
		return this;
	}

}
