package examples;

public class CloneExample {
	
	public static class Person implements java.lang.Cloneable {
		public Adresse address;

		public Object clone() throws CloneNotSupportedException {
			return super.clone();
		}
	}
	
	public static class Adresse {
		
	}
	
	public static void main(String[] args) throws Exception {
		boolean b1; 
		Boolean b2 = new Boolean(false);
		b1 = b2.booleanValue();
		
		Person a = new Person();
		a.address = new Adresse();
		Person b = (Person) a.clone();
		System.out.println(a.address == b.address);
		b.address = new Adresse();
		System.out.println(a.address == b.address);
	}

}
