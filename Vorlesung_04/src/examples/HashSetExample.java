package examples;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	private String s1;
	private String s2;
	
	public HashSetExample(String s1, String s2) {
		super();
		this.s1 = s1;
		this.s2 = s2;
	}
	
	/*
	@Override
	public boolean equals(Object obj) {
		HashSetExample other = (HashSetExample)obj;
		return this.s1.equals(other.s1) && this.s2.equals(other.s2);
	}

	@Override
	public int hashCode() {
		return s1.hashCode() + s2.hashCode() * 11;
	}
	*/

	
	
	public static void main(String[] args) {
		Set<HashSetExample> beispiel = new HashSet<HashSetExample>();
		beispiel.add(new HashSetExample("a", "b"));
		beispiel.add(new HashSetExample("a", "b"));
		
		System.out.println(beispiel.size());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((s1 == null) ? 0 : s1.hashCode());
		result = prime * result + ((s2 == null) ? 0 : s2.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashSetExample other = (HashSetExample) obj;
		if (s1 == null) {
			if (other.s1 != null)
				return false;
		} else if (!s1.equals(other.s1))
			return false;
		if (s2 == null) {
			if (other.s2 != null)
				return false;
		} else if (!s2.equals(other.s2))
			return false;
		return true;
	}
}
