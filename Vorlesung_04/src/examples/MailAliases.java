package examples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MailAliases {
	public static void main(String[] args) {
		Map<String, String> h = new HashMap<String, String>();
		
		// Pflege der Aliase
		h.put("Fritz", "f.mueller@test.de");
		h.put("Franz", "fk@b-blabla.com");
		h.put("Paula", "user0125@mail.uofm.edu");
		h.put("Lissa", "lb3@gateway.fhdto.northsurf.dk");
		
		// Ausgabe
		System.out.println(h.get("Fritz"));
		
	}
}