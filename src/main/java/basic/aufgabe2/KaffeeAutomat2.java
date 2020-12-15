package basic.aufgabe2;

public class KaffeeAutomat2 {

    public static void main(String[] args) {

    int preis = 30;
    int gegeben = 200;
    int rueckgeld = gegeben - preis;
    int[] wert = new int[5];
    wert[0] = 100;
    wert[1] = 50;
    wert[2] = 20;
    wert[3] = 10;
    wert[4] = 5;
    int[] anzahl = new int[5];

    for (int i = 0; i < 5; i++) {
        anzahl[i] = rueckgeld / wert[i];
        rueckgeld = rueckgeld % wert[i];
        System.out.println(" Anzahl" + wert[i] +" Muenzen " + anzahl[i] + "Rest " + rueckgeld );
        }
    }
}
