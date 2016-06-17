package generic.runtime;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Element<String> eS = new Element<String>("hallo1");
		System.out.println(eS.getValue());
		List<String> li = new ArrayList<String>();
		li.add("hallo2");
		Element<List<String>> eL = new Element<List<String>>(li);
		System.out.println(eL.getValue().get(0));
		
	 	List<? extends Comparable<?>> list;
	 	list = new ArrayList<Integer>();
	 	//list = new ArrayList<Object>();
	 	list = new ArrayList<String>();
	}
}
