package list.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import list_wrapper.StringList;

public class Main {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<String>();
		myList.add("hi");
		Iterator<String> myIter = myList.iterator();
		while (myIter.hasNext()) {
			System.out.println(myIter.next());
		}

		List<String> names = new ArrayList<String>();
		Iterator<String> i = names.iterator();
		while (i.hasNext()) {
			String s = i.next(); // must be called before you can call
									// i.remove()
			// Do something
			i.remove();
		}

		List<String> list = new ArrayList<String>();
		list.add("Franz");
		list.add("Hans");
		ListIterator<String> listIterator = list.listIterator();
		System.out.println(list);
		while (listIterator.hasNext()) {
			String listElem = listIterator.next();
			if (listElem.equals("Hans")) {
				listIterator.remove();
				listIterator.add("gelšscht");
			}
		}
		System.out.println(list);
	}

}
