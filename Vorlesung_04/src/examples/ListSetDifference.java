package examples;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListSetDifference {
	public static void main(String[] args) {
		String s1 = "aaa";
		String s2 = new String("aaa");
		String s3 = "bbb";
		
		List<String> myList = new ArrayList<String>();
		myList.add(s1);
		myList.add(s1);
		myList.add(s3);
		
		System.out.println(myList.size());
		System.out.println(myList);
		
		HashSet<String> mySet = new HashSet<String>();
		mySet.add(s1);
		mySet.add(s2);
		mySet.add(s3);
		
		System.out.println(mySet.size());
		System.out.println(mySet);
		
		System.out.println(mySet.getClass().getCanonicalName());
		System.out.println(mySet instanceof Set);
		System.out.println(myList.getClass().isAssignableFrom(mySet.getClass()));
	}
}
