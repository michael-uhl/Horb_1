package t01;

import java.io.Reader;

public class Main {

	public static void main(String[] args) throws Exception {
//		Reader reader = new BigLetterConverter(
//							new LineBreakAdder(
//								new RandomWordsReader()));
		Reader reader = new LineBreakAdder(new RandomWordsReader());
		
//		Reader reader = 
//				new LineBreakAdder(new Aufgabe2(new RandomWordsReader()));
		
		for (int i = 0;; i++) {
			char[] buf = new char[1024];
			reader.read(buf, 0, 10);
			String read = new String(buf);
			System.out.print(new String(read));
		}
	}
}
