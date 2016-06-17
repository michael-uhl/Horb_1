package examples;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class HashMapNotFoundExample {

	public static void main(String[] args) {
//		System.out.println(new ArrayList<String>().getClass());
//		System.out.println(new ArrayList<Integer>().getClass());
		
		Point q = new Point( 10, 10 );
		Map<Point, String> hm = new HashMap<Point, String>();
		hm.put( q, "Punkt q" );
		System.out.println( hm.get(q) );
		q.x = 12345;
		System.out.println( hm.get(q) );	
		q.x = 10;
		System.out.println( hm.get(q) );	
	}

}
