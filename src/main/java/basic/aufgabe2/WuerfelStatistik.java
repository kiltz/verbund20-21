package basic.aufgabe2;

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

public class WuerfelStatistik {

	public static void main(String[] args) {
		int i = 0;
		int[] Zahlenhäufigkeit = {0, 0, 0, 0, 0, 0};
		while (i < 10000) {
			double zufall = Math.random();
			i = i + 1;
			//system.out.println(zufall);

			if (zufall < 0.1666666) {
				Zahlenhäufigkeit[0] = Zahlenhäufigkeit[0] + 1;
			} else if (zufall < 0.3333333) {
				Zahlenhäufigkeit[1] = Zahlenhäufigkeit[1] + 1;
			} else if (zufall < 0.4999999) {
				Zahlenhäufigkeit[2] = Zahlenhäufigkeit[2] + 1;
			} else if (zufall < 0.6666666) {
				Zahlenhäufigkeit[3] = Zahlenhäufigkeit[3] + 1;
			} else if (zufall < 0.8333333) {
				Zahlenhäufigkeit[4] = Zahlenhäufigkeit[4] + 1;
			} else {
				Zahlenhäufigkeit[5] = Zahlenhäufigkeit[5] + 1;
			}
		}
		int zahl = 0;
		for (int anzahl : Zahlenhäufigkeit) {
			zahl = zahl + 1;
			System.out.println(zahl + ":  " + anzahl);
		}

	}
}