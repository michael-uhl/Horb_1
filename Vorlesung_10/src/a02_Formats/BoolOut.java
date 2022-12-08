package a02_Formats;

public class BoolOut {
    public static void main(String ... args) {
        System.out.printf("Wert für 'wahr': %b.%n", true);
        System.out.printf("Wert für 'falsch': %b.%n", false);

        System.out.printf("Fehler: %b.%n", 12);
        System.out.printf("Fehler: %b.%n", 0);
        System.out.printf("Fehler: %b.%n", "afdfd");
        System.out.printf("Fehler: %b.%n", null);
    }
}
