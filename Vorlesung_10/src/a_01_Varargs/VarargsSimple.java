package a_01_Varargs;

public class VarargsSimple {
	
	public static void main(String ... args) {
		VarargsSimple vs = new VarargsSimple();
		System.out.println(vs.concatString());
		System.out.println(vs.concatString("Hallo", " ", "Welt."));
	}
	
	public String concatString(String ... parts) {
		StringBuilder sb = new StringBuilder();
		for(String part : parts) {
			sb.append(part);
		}
		
		return sb.toString();
	}
	

}
