package oop.basic.aufgabe2;

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

		int max=6;
		int min=1;
		int range=max-min+1;
		int anzahl1=0;
		int anzahl2=0;
		int anzahl3=0;
		int anzahl4=0;
		int anzahl5=0;
		int anzahl6=0;

		double timeNeeded=0;
		int[] alleZahlen=new int[10000];
		for(int i=0;i<10000;i++){
			int zufall = (int) (Math.random() *range)+min;
			alleZahlen[i]=zufall;
			if(zufall==1){
				anzahl1++;
			}
			else if(zufall==2){
				anzahl2++;
			}
			else if(zufall==3){
				anzahl3++;
			}
			else if(zufall==4){
				anzahl4++;
			}
			else if(zufall==5){
				anzahl5++;
			}
			else{
				anzahl6++;
			}
		}
		timeNeeded=System.currentTimeMillis();


		System.out.println("Anzahl 1: " + anzahl1 + " Anzahl2: " + anzahl2 + " Anzahl3: " + anzahl3 + " Anzahl4: " + anzahl4 + " Anzahl5: " + anzahl5 + " Anzahl6: " + anzahl6);
		System.out.println(timeNeeded);

	}
}
