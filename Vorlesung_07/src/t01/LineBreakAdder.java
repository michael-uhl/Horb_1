package t01;

import java.io.IOException;
import java.io.Reader;

public class LineBreakAdder extends Reader {
	
	private Reader in;
	private int wordsInALine = 10;
	private int wordLineCounter = 0;

	public LineBreakAdder(Reader in) {
		super();
		this.in = in;
	}

	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		in.read(cbuf, off, len);
		
		for (int i = 0; i < cbuf.length; i++) {
			if (cbuf[i] == ' ') {
				wordLineCounter++;
				if (wordLineCounter == wordsInALine) {
					wordLineCounter = 0;
					cbuf[i] = '\n';
				}
			}
		}
		return 0;
	}

	@Override
	public void close() throws IOException {
		in.close();
	}

}
