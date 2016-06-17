package a01_Buffer;

import java.nio.IntBuffer;

public class UseIntBufferRewind {
	static public void main(String args[]) throws Exception {
		IntBuffer buffer = IntBuffer.allocate(10);

		for (int i = 0; i < buffer.capacity(); ++i) {
			buffer.put(i);
		}

		buffer.flip();

		for (int i = 0; i < 2; i++) {
			while (buffer.hasRemaining()) {
				System.out.println(buffer.get());
			}
			buffer.rewind();
		}
	}
}
