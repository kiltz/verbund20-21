package basic.aufgabe2;

import sun.awt.geom.AreaOp;
import sun.java2d.pipe.SolidTextRenderer;

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
		int max = 6;
		int min = 1;

		int[] zahlen = {0,0,0,0,0,0};

		for(int i = 0; i < 10000 ;i++)
		{
			double zufall = Math.random()*max + min ;
			int zahl=0;
			zahl= (int) (zufall);
			System.out.println(zufall);
			zahlen[zahl-1]++;

		}
		System.out.println("Einser: "+zahlen[0]);
		System.out.println("Zweier: "+zahlen[1]);
		System.out.println("Dreier: "+zahlen[2]);
		System.out.println("Vierer: "+zahlen[3]);
		System.out.println("Fuenfer: "+zahlen[4]);
		System.out.println("Sechser: "+zahlen[5]);
		int gesamt = zahlen[0]+zahlen[1]+zahlen[2]+zahlen[3]+zahlen[4]+zahlen[5];
		System.out.println(gesamt);

		// hier gehts los....
	}
}
