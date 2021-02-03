package basic.aufgabe1;

public class KaffeeAutomat {
    public static void main(String[] args) {
        int preis = 30;
        int gegeben = 200;
        int rueckgeld = gegeben - preis;
        System.out.println(rueckgeld);

        int anzahl = rueckgeld / 100;
        rueckgeld = rueckgeld % 100;
        System.out.println(anzahl + " 1-Euro Muenze(n) (Rueckgeld: "+rueckgeld+")");

        anzahl = rueckgeld / 50;
        rueckgeld = rueckgeld % 50;
        System.out.println(anzahl + " 50-Cent Muenze(n) (Rueckgeld: "+rueckgeld+")");

        anzahl = rueckgeld / 20;
        rueckgeld = rueckgeld % 20;
        System.out.println(anzahl + " 20-Cent Muenze(n) (Rueckgeld: "+rueckgeld+")");

        anzahl = rueckgeld / 10;
        rueckgeld = rueckgeld % 10;
        System.out.println(anzahl + " 10-Cent Muenze(n) (Rueckgeld: "+rueckgeld+")");

        anzahl = rueckgeld / 5;
        rueckgeld = rueckgeld % 5;
        System.out.println(anzahl + " 5-Cent Muenzen (Rueckgeld: "+rueckgeld+")");
    }
}
