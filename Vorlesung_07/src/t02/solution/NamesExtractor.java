package t02.solution;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/*
 * Bash:
 * cat names.txt | sed -e 's/,/\n/g' | grep "\S" | awk '{$1=$1};1' | sort | uniq -c | sort-r
 * (1)             (2)                (3)          (4)               (5)    (6)       (7)
 *
 * (1): Datei einlesen.
 * (2): Kommaseparierte Werte Pro Zeile.
 * (3): Leere Zeilen raus.
 * (4): Führende Leerzeichen raus.
 * (5): Sortieren.
 * (6): Zählen.
 * (7): Sortieren für endgültige Ausgabe (größter Wert zuerst).
 */

public class NamesExtractor {
    public static void main(String[] args) throws IOException {
        Reader namesReader = new InputStreamReader(new FileInputStream("/tmp/names.txt"), "UTF-8");
        CharBuffer namesBuf = ByteBuffer.allocateDirect(10 * 1024).asCharBuffer();
        String verschnitt = "";

        Map<String, NameEntry> namesAndQuantities = new HashMap<>();

        Date start = new Date();
        while (namesReader.read(namesBuf) != -1) {
            namesBuf.flip();

            String chunk = namesBuf.toString();
            chunk = chunk.replaceAll(" ","");
            List<String> names = new ArrayList<>(Arrays.asList(chunk.split(",")));

            names.set(0, verschnitt + names.get(0));

            //Verschnitt
            if (!chunk.endsWith(",") && !chunk.endsWith(" ")) {
                verschnitt = names.get(names.size() - 1);
                names.remove(names.size() - 1);
            } else {
                verschnitt = "";
            }

            for (String name : names) {
                if (name.isBlank()) {
                    continue;
                }

                if (namesAndQuantities.containsKey(name)) {
                    namesAndQuantities.get(name).quantity++;
                } else {
                    namesAndQuantities.put(name, new NameEntry(name));
                }
            }

            namesBuf.clear();
        }

        namesReader.close();

        Date end = new Date();

        System.out.println("Dauer: " + (end.getTime() - start.getTime()) + "ms.\n\n");

        Set<NameEntry> forOutput = new TreeSet<NameEntry>(namesAndQuantities.values());

        for (NameEntry nm : forOutput) {
            System.out.printf( "%-20s%d%n", nm.name, nm.quantity);
        }
    }

}

class NameEntry implements Comparable<NameEntry> {
    String name;
    int quantity = 1;

    public NameEntry(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(NameEntry o) {
        return quantity < o.quantity ? 1 : quantity > o.quantity ? -1 : 0;
    }
}
