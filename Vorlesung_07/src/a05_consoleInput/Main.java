package a05_consoleInput;

public class Main {
	public static void main(String[] args) throws Exception {
		char c = ' ';
		String s = new String();
		while (c != '\n') {
			c = (char) System.in.read();
			s = s + c;
		}
		System.out.println(s);
	}
}
