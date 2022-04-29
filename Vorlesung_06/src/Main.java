import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Main {
	
	public static void main(String[] args) {
		Glas<String> gg = new Glas<String>("Weiﬂwein");
		
		try {
			method(10);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method(int i) throws Exception {
		List<String> list = new ArrayList<String>();
		  list.add("Franz");
		  list.add("Hans");
		  ListIterator<String> listIterator = list.listIterator();
		  System.out.println(list);
		  while (listIterator.hasNext()) {
		   	  String listElem = listIterator.next();
			  if (listElem.equals("Hans")) {
				  listIterator.set("geloescht");
			  }
		  }
		  System.out.println(list);
	}
}
