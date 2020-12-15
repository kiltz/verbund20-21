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


		int zahl = 1;
		int zaehler[] = {0, 0, 0, 0, 0, 0};

		for(int i = 0; i < 10000; i++){
			int zufall = (int)(Math.random() * 6 + 1);
			zaehler[zufall -1] = zaehler[zufall -1] + 1;
		}

		for(int i = 0; i < zaehler.length; i++){
			System.out.println("Die Zahl " + zahl + " wurde " + zaehler[i] + " mal gewuerfelt.");
			++zahl;
		}
	}
}
