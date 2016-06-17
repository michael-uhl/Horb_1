package t01;

import java.io.IOException;
import java.io.Reader;

public class BigLetterConverter extends Reader {

	private Reader reader;
	
	public BigLetterConverter(Reader reader) {
		this.reader = reader;
	}

	public int read(char[] cbuf, int off, int len) throws IOException {
		int numberOfReadBytes = reader.read(cbuf, off, len);
		String tmp = new String(cbuf);
		tmp.toUpperCase().getChars(0, tmp.length(), cbuf, 0);
		return numberOfReadBytes;
	}

	@Override
	public void close() throws IOException {
		reader.close();
	}

}
