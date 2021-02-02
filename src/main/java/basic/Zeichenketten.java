package basic;

/**
 * Aufgabe:
 *
 * Baut einen Dialog mit dem Namen gui.feature.passwort.PasswdApp
 *
 * Erzeugt in diesem Dialog Passwörter.
 *
 * 1. Stufe: gebt in einem Testfeld die Länge ein
 *
 * 2. Stufe: Bietet je eine Checkbox für
 *      - Mit Großbuchstaben
 *      - Mit Zahlen
 *      - Mit Sonderzeichen
 *      - Mindestens jedes ist vorhanden
 *
 *
 */

public class Zeichenketten {
    public static void main(String[] args) {
        //                        01234567890123456789
        String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
        String neu = ""+erlaubteZeichen.charAt(4)+erlaubteZeichen.charAt(7)+erlaubteZeichen.charAt(12);
        System.out.println(neu);
        String test = "";
        for (int i = 0; i < 15; ++i) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            test += erlaubteZeichen.charAt(pos);
        }
        System.out.println(test);
    }
}
