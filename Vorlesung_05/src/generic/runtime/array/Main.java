package generic.runtime.array;

public class Main {
	public static void main(String[] args) {
		Flasche<? extends Wasser>[] kasten = new Flasche[6];
		Wasser wasser = new Wasser();
		kasten[0] = new Flasche<Wasser>(wasser);
		Flasche<Wasser> f = (Flasche<Wasser>)kasten[0];
		Fluessigkeit w = f.entleeren();
	}
}
