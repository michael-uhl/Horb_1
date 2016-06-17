package a13_indexSequentiell;

import java.io.IOException;
import java.io.RandomAccessFile;
 
public final class IndexSequenziellSingleThreaded {
    public static void main(String[] args) {
        try {
			RandomAccessFile raf = new RandomAccessFile("res/data.rel", "rw");
			 
			Record r1 = new Record("Hans", "Müller", 42, 11, "rot");
			System.out.println("r1 = " + r1);
			 
			long pos = raf.getFilePointer(); // Position in Datei für Index sichern
			r1.write(raf);
			raf.seek(pos + Record.LENGTH); // auf naechsten Eintrag zeigen (padding)
			 
			Record r2 = new Record("Hans", "Maier", 35, 11, "rot");
			r2.write(raf);
			 
			raf.seek(pos + Record.LENGTH); // Position aus dem Index
			Record r3 = Record.read(raf);
			System.out.println("r3 = " + r3);
			raf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
 
class RecordSingleThreaded {
    public static final int LENGTH = 3 * 20 * 6 + 2 * 4 + 2 * 4;
 
	String vorname;
	String nachname;
	int alter;
	int anzahlFinger;
	String farbe;
 
    private RecordSingleThreaded() {
    }
 
    public RecordSingleThreaded(String vorname, String nachname, int alter, int anzahlFinger,
            String farbe) {
        if (vorname.length() > 20) {
            throw new IllegalArgumentException("vorname zu lang");
        }
        if (nachname.length() > 20) {
            throw new IllegalArgumentException("nachname zu lang");
        }
        if (farbe.length() > 20) {
            throw new IllegalArgumentException("farbe zu lang");
        }
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
        this.anzahlFinger = anzahlFinger;
        this.farbe = farbe;
    }
 
    static RecordSingleThreaded read(RandomAccessFile file) throws IOException {
    	RecordSingleThreaded r = new RecordSingleThreaded();

        r.vorname = file.readUTF();
        r.nachname = file.readUTF();
        r.alter = file.readInt();
        r.anzahlFinger = file.readInt();
        r.farbe = file.readUTF();
        
        return r;
    }
 
    void write(RandomAccessFile file) throws IOException {
        file.writeUTF(vorname);
        file.writeUTF(nachname);
        file.writeInt(alter);
        file.writeInt(anzahlFinger);
        file.writeUTF(farbe);
    }
 
    @Override
    public String toString() {
        return "Record{" + "vorname=" + vorname + ", nachname=" + nachname
                + ", alter=" + alter + ", anzahlFinger=" + anzahlFinger
                + ", farbe=" + farbe + '}';
    }
}