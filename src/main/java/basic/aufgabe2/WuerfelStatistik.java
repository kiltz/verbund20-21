package basic.aufgabe2;

/**
 * Aufgabe:
 * <p>
 * Würfle 10000 mal, nutze dazu die Klasse Math, die eine Methode random()
 * anbietet die eine Zufallszahl erzeugt.
 * <p>
 * Wandele die Zufallszahl in eine Zahl zwischen 1 und 6 um.
 * <p>
 * Merke Dir in einem Array wie oft welche Zahl gewürfelt wurde.
 * <p>
 * Gebe die Statistik aus.
 * <p>
 * Zusatzaufgabe:
 * <p>
 * Stoppe die Zeit, die für den Durchlauf gebraucht wird.
 * ( System.currentTimeMillis() )
 * Gebe das Ergebnis in ansprechender Form aus.
 * <p>
 * Variiere die Anzahl der Durchläufe, gehe in die Masse.
 */

public class WuerfelStatistik {

    public String wuerfeln(int amountOfRolls){

        int[] arrayOfNumbers = new int[amountOfRolls];
        int anzahl1 = 0;
        int anzahl2 = 0;
        int anzahl3 = 0;
        int anzahl4 = 0;
        int anzahl5 = 0;
        int anzahl6 = 0;

        for (int i = 0; i < amountOfRolls; i++) {
            int zufall = (int) (Math.random() * 6 + 1);
            if (zufall == 1) {
                anzahl1 += 1;
            } else if (zufall == 2) {
                anzahl2 += 1;
            } else if (zufall == 3) {
                anzahl3 += 1;
            } else if (zufall == 4) {
                anzahl4 += 1;
            } else if (zufall == 5) {
                anzahl5 += 1;
            } else if (zufall == 6) {
                anzahl6 += 1;
            }
            arrayOfNumbers[i] = zufall;
        }

        return("1: " + anzahl1+
                ", 2: " + anzahl2+
                ", 3: " + anzahl3+
                ", 4: " + anzahl4+
                ", 5: " + anzahl5+
                ", 6: " + anzahl6);

    }
}
