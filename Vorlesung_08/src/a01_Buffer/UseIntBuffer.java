package a01_Buffer;

import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;

public class UseIntBuffer {
	static public void main(String args[]) throws Exception {
		IntBuffer buffer = IntBuffer.allocate(10).put(999).put(50);

		
		for (int i = 0; i < buffer.capacity() - 2; ++i) {
			buffer.put(i*2);
		}

		buffer.flip();

		while (buffer.hasRemaining()) {
			System.out.println(buffer.get());
		}
	}
}