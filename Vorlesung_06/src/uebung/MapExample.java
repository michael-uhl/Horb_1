package uebung;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapExample {
	public static void main(String[] args) {
		SortedMap<String, Integer> test = new TreeMap<String, Integer>(new ReverseStringComparator());
		test.put("a", 3);
		test.put("c", 9);
		test.put("b", 1);
		
		Elementt<String,Integer,Double,Float> a = new Elementt<String, Integer, Double, Float>();
		
		System.out.println(test);
	}
	
	public static final class ReverseStringComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			return -1 * o1.compareTo(o2);
		}
		
	}
}
