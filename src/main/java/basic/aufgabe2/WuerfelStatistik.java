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
		int max = 6;
		int min = 1;

		int[] zahlen = {0,0,0,0,0,0};

		for(int i = 0; i < 10000 ;i++)
		{
			double zufall = Math.random()*(max+1);
			zufall= (int) (zufall);
			System.out.println(zufall);
			if(zufall==1.0){
				zahlen[0]++;
			}
			else if(zufall==2.0){
				zahlen[1]++;
		}
			else if(zufall==3.0){
				zahlen[2]++;
			}
			else if(zufall==4.0){
				zahlen[3]++;
			}else if(zufall==5.0){
				zahlen[4]++;
			}else if(zufall==6.0){
				zahlen[5]++;
			}else{
			i--;
			}

		}
		System.out.println("Einser: "+zahlen[0]);
		System.out.println("Zweier: "+zahlen[1]);
		System.out.println("Dreier: "+zahlen[2]);
		System.out.println("Vierer: "+zahlen[3]);
		System.out.println("Fuenfer: "+zahlen[4]);
		System.out.println("Sechser: "+zahlen[5]);
		int gesammt = zahlen[0]+zahlen[1]+zahlen[2]+zahlen[3]+zahlen[4]+zahlen[5];
		System.out.println(gesammt);
		// hier gehts los....
	}
}
