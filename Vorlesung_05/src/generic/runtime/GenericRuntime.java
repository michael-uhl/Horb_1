package generic.runtime;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GenericRuntime {
	public static void main(String[] args) {
		{
			Map<String, Integer> test = new HashMap<String, Integer>();
			test.put("fünf", 5);
			System.out.println(test.get("fünf"));
		}
		{
			List<String> stringList = new ArrayList<String>();
			Set<String> stringSet = new HashSet<String>();
			stringSet.add("set_add");
			String s = stringList.get(0);
			List<Set<String>> example2 = new ArrayList<Set<String>>();
			example2.add(stringSet);
			System.out.println(stringList.getClass().getName());
			System.out.println(example2.getClass().getName());
			System.out.println(example2 instanceof List<?>);
			
			List added = new LinkedList();
			added.add(stringList);
			added.add(example2);
			
			List<String> gotten = (List<String>)added.get(1);
			if(gotten instanceof List<?>) {
				gotten.add("geht nicht.");
			}
			String gottenFirstString = gotten.get(0);
			System.out.println(gottenFirstString);
		}
	}
}
