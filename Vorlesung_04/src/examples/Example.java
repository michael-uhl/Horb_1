package examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Example implements Comparable<Example> {

	private String s = null;
	
	public Example(String s) {
		this.s = s;
	}

	@Override
	public int compareTo(Example other) {
		if (this.s.length() == other.s.length()) 
			return 0;
		else if (this.s.length() > other.s.length())
			return 1;
		else
			return -1;
	}
	
	@Override
	public boolean equals(Object o) {
		Example other = (Example)o;
		return this.s.length() == other.s.length();
	}
	
	
	@Override
	public int hashCode() {
		return s.length();
	}

	@Override
	public String toString() {
		return s;
	}
	
	public static void main(String[] args) {
		Set<Example> mySet = new TreeSet<Example>();
		mySet.add(new Example("a"));
		mySet.add(new Example("aaaaa"));
		mySet.add(new Example("aa"));
		mySet.add(new Example("a"));
		mySet.add(new Example("a"));
		mySet.add(new Example("a"));
		System.out.println(mySet.add(new Example("a")));
		
		System.out.println(mySet);
	}


}
