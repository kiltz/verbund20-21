package basic.aufgabe2;

public class KaffeeAutomat2 {
    public static void main(String[] args) {

        int preis = 30;
        int gegeben = 200;
        int rest = gegeben - preis;
        int[] wert = {100, 50, 20, 10, 5};

        for (int i = 0; i < wert.length; i++) {
            int anzahl = rest / wert[i];
            rest = rest % wert[i];
            System.out.println(anzahl + rest);
        }
    }
}
