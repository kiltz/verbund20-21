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
		int[] wuerfelZahl = new int[100];
		int zahl1 = 0;
		int zahl2 = 0;
		int zahl3 = 0;
		int zahl4 = 0;
		int zahl5 = 0;
		int zahl6 = 0;

		for (int i = 0; i < 100; i++){
			int zufall = (int) (Math.random() * 6 + 1);
			if (zufall == 1){
				zahl1 += 1;
			}else if(zufall == 2){
				zahl2 += 1;
			}else if(zufall == 3){
				zahl3 += 1;
			}else if(zufall == 4){
				zahl4 += 1;
			}else if(zufall == 5){
				zahl5 += 1;
			}else if(zufall == 6){
				zahl6 += 1;
			}
			wuerfelZahl[i] = zufall;
		}

		System.out.println("1: " + zahl1 +
						  " 2: " + zahl2 +
						  " 3: " + zahl3 +
						  " 4: " + zahl4 +
						  " 5: " + zahl5 +
						  " 6: " + zahl6);

		System.out.println("Die benoetigte Zeit " + System.currentTimeMillis() + " in Millisekunden");

		double zufall = Math.random();


	}
}
