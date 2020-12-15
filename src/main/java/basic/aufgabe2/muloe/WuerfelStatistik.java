package basic.aufgabe2.muloe;

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
    public static void main(String[] args) {

//        int[] wuerfe = {0,0,0,0,0,0};
        int[] wuerfe = new int[12];

        for (int i = 0; i < 10000000; ++i) {
            int wuerfelErgebnis = (int) (Math.random() * wuerfe.length) + 1;
            wuerfe[wuerfelErgebnis - 1]++;
        }

        for (int i = 0; i < wuerfe.length; ++i){
            System.out.println((i+1)+": "+wuerfe[i]);
        }


    }
}
