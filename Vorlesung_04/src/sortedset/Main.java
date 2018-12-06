package sortedset;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import hashset.Geschaeftskd;
import hashset.Kunde;

public class Main {
	public static void main(String[] args) {
		//List<? extends List<?>> a = new ArrayList<List<LinkedList<?>>>();
		
		List<? extends Kunde> kd = new ArrayList<Geschaeftskd>();
		
		Set<String> beispiel = new TreeSet<String>();
		
		beispiel.add("bbb");
		beispiel.add("ccc");
		beispiel.add("aaa");
		
		System.out.println(beispiel);
		
		beispiel = new TreeSet<String>(new StringLengthComparator());
		
		beispiel.add("g");
		beispiel.add("z");
		beispiel.add("aaa");
		beispiel.add("bb");
		
		System.out.println(beispiel);
	}
}
