package t02.solution;

import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;


public class JustRead {
    public static void main(String[] args) throws Exception {
        FileChannel c = new FileInputStream("/tmp/names.txt").getChannel();
        ByteBuffer bb = ByteBuffer.allocateDirect(100 * 1024);

        long checksum = 0;

        byte utf8Comma = 0b00101100;

        Date start = new Date();
        while(true) {
            bb.clear();

            int read = c.read(bb);
            if (read == -1) {
                break;
            }

            bb.flip();
            while(bb.hasRemaining()) {
                byte bbb = bb.get();
                if (bbb == utf8Comma) {
                    checksum++;
                } else {
                }
            }

        }
        Date end = new Date();

        System.out.println(end.getTime() - start.getTime());
        System.out.println(checksum);

        c.close();
        //42589152

    }

    class BytesKey {
        private final byte[] array;

        public BytesKey(byte[] array) {
            this.array = array;
        }

        public byte[] getArray() {
            return array.clone();
        }
    }
}
