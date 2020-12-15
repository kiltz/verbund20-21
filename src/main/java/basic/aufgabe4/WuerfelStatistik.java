/**
 * Aufgabe:
 *
 * Würfle 10000 mal, nutze dazu die Klasse Math, die eine Methode random()
 * anbietet die eine Zufallszahl erzeugt.
 *
 * Wandele die Zufallszahl in eine Zahl zwischen 1 und 6 um.
 *
 * Merke Dir in einem Array wie oft welche Zahl gewürfelt wurde.
 *
 * Gebe die Statistik aus.
 *
 * Zusatzaufgabe:
 *
 * Stoppe die Zeit, die für den Durchlauf gebraucht wird.
 * ( System.currentTimeMillis() )
 * Gebe das Ergebnis in ansprechender Form aus.
 *
 * Variiere die Anzahl der Durchläufe, gehe in die Masse.
 *
 */

package basic.aufgabe4;

public class WuerfelStatistik {

    private int wert;
    private int zahl;
    private int anzahlEins;
    private int anzahlZwei;
    private int anzahlDrei;
    private int anzahlVier;
    private int anzahlFuenf;
    private int anzahlSechs;

    public WuerfelStatistik() {

        anzahlEins = 0;
        anzahlZwei = 0;
        anzahlDrei = 0;
        anzahlVier = 0;
        anzahlFuenf = 0;
        anzahlSechs = 0;

    }

    public void wuerfeln() {
        wert = (int) (Math.random() * 6 + 1);
    }

    public int getWert() {
        return wert;
    }

    public void testeWuerfel(int anzahl) {
        int wert;
        for (int i = 1; i <= anzahl; ++i) {
            wert = (int) (Math.random() * 6 + 1);
            System.out.println(wert);

            if (wert == 1) {
                anzahlEins = anzahlEins + 1;
            }
            if (wert == 2) {
                anzahlZwei = anzahlZwei + 1;
            }
            if (wert == 3) {
                anzahlDrei = anzahlDrei + 1;
            }
            if (wert == 4) {
                anzahlVier = anzahlVier + 1;
            }
            if (wert == 5) {
                anzahlFuenf = anzahlFuenf + 1;
            }
            if (wert == 6) {
                anzahlSechs = anzahlSechs + 1;
            }
        }
        System.out.println(anzahlEins + "-mal" + "Augenzahl 1");
        System.out.println(anzahlZwei + "-mal" + "Augenzahl 1");
        System.out.println(anzahlDrei + "-mal" + "Augenzahl 1");
        System.out.println(anzahlVier + "-mal" + "Augenzahl 1");
        System.out.println(anzahlFuenf + "-mal" + "Augenzahl 1");
        System.out.println(anzahlSechs + "-mal" + "Augenzahl 1");

    }
}
