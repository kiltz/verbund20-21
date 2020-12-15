package basic.aufgabe2;

public class Wuerfeln {

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

    public static void main(String[] args) {

        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int durchlaeufe=10000;
        double timeNeeded = 0;
        int[] anzahlZahlen={0,0,0,0,0,0};
        for (int i = 0; i < durchlaeufe; i++) {
            int zufall = (int) (Math.random() * range) + min;
            anzahlZahlen[zufall-1]++;
        }
        timeNeeded = System.currentTimeMillis();


        for(int i=0;i<6;i++){
            System.out.println(anzahlZahlen[i]);
        }
        System.out.println(timeNeeded);

    }
}

