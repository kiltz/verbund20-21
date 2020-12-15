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
		int[] anzahl = {0,0,0,0,0,0};
		int max = 6;
		int min = 1;
		int zahl = 1;
		int range = max - min + 1;
		int durchlaeufe = 150000;

		for (int i = 0; i < durchlaeufe; i++) {

			int zufall = (int)(Math.random() * range) + min;
			anzahl[zufall-1] = anzahl[zufall-1]+1;
		}
		for (int j : anzahl) {
			System.out.println("Die Zahl " + zahl + " wurde " + j + " gewuerfelt");
			++zahl;
		}
		System.out.println("Der Computer hat fuer die Aufgabe " + System.currentTimeMillis() + "ms gebraucht");

	}
}
