package examples;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		Set<String> names = new HashSet<String>();
		names.add("Anton");
		names.add("Zacharias");
		names.add("Max");
		names.add("Max");
		
		System.out.println(names);
		
		Set<String> sortedNames = new TreeSet<String>();
		sortedNames.addAll(names);
		System.out.println(sortedNames);
		
		sortedNames = new TreeSet<String>(new StringLengthComparator());
		sortedNames.addAll(names);
		System.out.println(sortedNames);
	}
}






