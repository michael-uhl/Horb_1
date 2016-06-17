package sol;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;

public class FileSplitter {
	
	private File file2Split;
	private final long fileLengthSplittedBytes = (long)1.44 * 1024 * 1024;
	private long fileLengthBytes;
	
	public static void main(String[] args) {
		try {
			String filename = args[0];
			File file2Split = new File("res/big.file");
			
			FileSplitter splitter = new FileSplitter(file2Split);
			splitter.split();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public FileSplitter(File file2Split) {
		this.file2Split = file2Split;
		fileLengthBytes = file2Split.length();
	}
	
	public void split() throws IOException {
		long timeBefore = new Date().getTime();
		InputStream ins = 
				new BufferedInputStream(new FileInputStream(file2Split));
		
		long numberOfParts = evaluateNumberOfPars();
		
		long bytesWritten = 0;
		for (long i = 0; i < numberOfParts; i++) {
			OutputStream curOutstream = createPartOutStream(i);
			
			for (long j = 0; j < fileLengthSplittedBytes; j++) {
				curOutstream.write(ins.read());
				bytesWritten++;
				if (bytesWritten >= fileLengthBytes) {
					break;
				}
			}
			curOutstream.flush();
			curOutstream.close();
		}
		ins.close();
		long timeAfter = new Date().getTime();
		System.out.println(timeAfter - timeBefore);
	}

	private OutputStream createPartOutStream(long i) throws IOException,
			FileNotFoundException {
		File curPart = new File(file2Split.getAbsolutePath() + "." + i);
		curPart.createNewFile();
		OutputStream curOutstream = new BufferedOutputStream(new FileOutputStream(curPart));
		return curOutstream;
	}

	private long evaluateNumberOfPars() {
		long numberOfParts = fileLengthBytes / fileLengthSplittedBytes;
		if (fileLengthBytes % fileLengthSplittedBytes != 0) {
			numberOfParts++;
		}
		return numberOfParts;
	}
}
