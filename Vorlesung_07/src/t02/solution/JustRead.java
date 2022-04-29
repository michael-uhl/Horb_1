package t02.solution;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class JustRead {
	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("/tmp/names.txt");
		FileChannel c = fin.getChannel();
		ByteBuffer bb = ByteBuffer.allocateDirect(100 * 1024);

		byte utf8Comma = 0b00101100;
		byte utf8Space = 0b00100000;

		Map<BytesKey, Integer> namesAndQuantities = new HashMap<>();
		BytesKey currentKey = new BytesKey();

		Date start = new Date();
		while (true) {
			bb.clear();

			int read = c.read(bb);
			if (read == -1) {
				break;
			}

			bb.flip();
			while (bb.hasRemaining()) {
				byte bbb = bb.get();
				if (bbb == utf8Comma) {
					if (namesAndQuantities.containsKey(currentKey)) {
						namesAndQuantities.put(currentKey, namesAndQuantities.get(currentKey) + 1);
						currentKey = new BytesKey();
					} else {
						namesAndQuantities.put(currentKey, 1);
						currentKey = new BytesKey();
					}
				} else if (bbb == utf8Space) { 
					// ignore;
				}
				else {
					currentKey.put(bbb);
				}
			}

		}
		Date end = new Date();

		System.out.println(end.getTime() - start.getTime());
		
		for (Entry<BytesKey, Integer> solution :namesAndQuantities.entrySet()) {
			System.out.printf( "%-20s%d%n", solution.getKey(), solution.getValue());
		}

		fin.close();
		c.close();
	}
}

class BytesKey {
	private byte[] array = new byte[20];
	private int position = 0;

	public BytesKey put(byte toAdd) {
		array[position] = toAdd;
		position++;

		if (position == array.length) {
			byte[] newArr = new byte[array.length * 2];

			for (int i = 0; i < array.length; i++) {
				array[i] = newArr[i];
			}

			this.array = newArr;
		}
		return this;
	}

	public byte[] getArray() {
		return array.clone();
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		BytesKey bytesKey = (BytesKey) o;
		return Arrays.equals(array, bytesKey.array);
	}

	@Override
	public int hashCode() {
		return Arrays.hashCode(array);
	}

	@Override
	public String toString() {
		return new String(array, 0, position);
	}
}
