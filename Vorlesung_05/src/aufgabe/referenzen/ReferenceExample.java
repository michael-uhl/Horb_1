package aufgabe.referenzen;

import java.util.ArrayList;
import java.util.List;

public class ReferenceExample {
	public static void main(String[] args) {
		{
			List a = new ArrayList();
			List b = a;
			a.add("hallo");
			System.out.println(b.size());
		}
		{
			List a = new ArrayList();
			List b = new ArrayList();
			a.add("hallo");
			System.out.println(b.size());			
		}
	}
}
