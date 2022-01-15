package t02.examplefile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class ExampleFileCreator {
    private static String[] names = { //
        "Max", //
        "Alexander", //
        "Heinz", //
        "Rumpelstilzchen", //
        "Jonas", //
        "Franz", //
        "Katharina", //
        "Susanne", //
        "Samir", //
        "Sina" //
    };//

    private static String separator = ", ";

    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("/tmp/names.txt");
        FileChannel namesFile = fout.getChannel();

        CharBuffer namesBuffer = CharBuffer.allocate(2048);
        for (int i = 0; i < 200000; i++) {
            namesBuffer.clear();

            while(namesBuffer.remaining() > 200) {
                namesBuffer.put(names[randomNr0ToNine()]);
                namesBuffer.put(separator);
            }

            namesBuffer.flip();

            namesFile.write(Charset.forName("UTF-8").encode(namesBuffer));
        }

        fout.close();
        namesFile.close();
    }

    private static int randomNr0ToNine() {
        return (int) (Math.random() * 10);
    }
}
