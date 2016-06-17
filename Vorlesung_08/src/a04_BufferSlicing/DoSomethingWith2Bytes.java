package a04_BufferSlicing;

import java.nio.ByteBuffer;

public class DoSomethingWith2Bytes {
	public static void main(String args[]) {
		byte[] bigArray = {1,2,3,4,5,6,7,8,9,0};
		new DoSomethingWith2Bytes().someMethod(bigArray);
	}
	
	void doSomething(ByteBuffer twoBytes) {
		byte b1 = twoBytes.get(0);
		byte b2 = twoBytes.get(1);
		System.out.println(b1+","+b2);
	}
	
	void someMethod(byte[] bigArray) {
		ByteBuffer buffer = ByteBuffer.wrap(bigArray);
		ByteBuffer readOnlyBuffer = buffer.asReadOnlyBuffer();
		System.out.println(readOnlyBuffer);
		for (int i = 0; i < bigArray.length - 1; i = i + 2) {
			buffer.position(i);
			buffer.limit(i+2);
			doSomething(buffer.slice());
		}
	}
}
