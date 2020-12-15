package basic.aufgabe2;

public class KaffeeAutomat2 {

    public static void main(String[] args) {

    int preis = 30;
    int gegeben = 200;
    int rueckgeld = gegeben - preis;
    int[] wert =  {100,50, 20, 10,5};
    String[] name =  {"1-Euro", "50-Cent", "20-Cent", "10-Cent", "5-Cent"};

    for (int i = 0; i < 5; i++) {
        int anzahl = rueckgeld / wert[i];
        rueckgeld = rueckgeld % wert[i];
        System.out.println(" Anzahl " + name[i] +" Muenze(n): " + anzahl + " Rest: " + rueckgeld );
        }
    }
}
