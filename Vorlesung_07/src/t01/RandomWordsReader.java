package t01;

import java.io.IOException;
import java.io.Reader;

public class RandomWordsReader extends Reader {
	
	private String[] words = {"fuck", "hello", "bye", "green", "foo", "bar"};
	private String rest = "";

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		String output = rest;
	
		for (int i=0; i < cbuf.length; i = output.length()) {
			int result = (int)(Math.random()*10) % 6;
			output = output + words[result] + " ";
		}
		
		String result = output.substring(0, cbuf.length);
		for (int i = 0; i < result.length(); i++) {
			cbuf[i] = result.charAt(i);
		}
		
		if (output.length() > cbuf.length) {
			rest = output.substring(cbuf.length);
		} else {
			rest = "";
		}
		
		return cbuf.length;
	}

	@Override
	public void close() throws IOException {
	}

}
