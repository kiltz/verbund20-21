package basic.Aufgabe3;

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



public class Muenze {


    public static void main(String[] args) {
        int preis = 30;
        int gegeben = 200;
        int rueckgeld = gegeben - preis;

        int[] geld = new int [] {1, 2, 5, 10, 20, 50, 100, 200};


        int[] anzahl = new int[5];

        String[] name = new String[] {"1", "50ent", "20cent", "10Cent", "5cent"};

        for (int i = 0; i < 5; i++) {
            anzahl[i] = rueckgeld / geld[i];
            rueckgeld = rueckgeld % geld[i];
            System.out.println(" Anzahl " + name[i] +" Muenze(n): " + anzahl[i] + " Rest: " + rueckgeld );
        }
    }
}


