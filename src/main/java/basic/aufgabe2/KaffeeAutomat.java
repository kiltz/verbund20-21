package basic.aufgabe2;

public class KaffeeAutomat {
    public static void main(String[] args) {
        int preis = 30;

        int gegeben = 100;

        int rueck = gegeben - preis;

        int[] muenzen = {200, 100, 50, 20, 10, 5, 2, 1};
        String[] bezeichnung = {"2Eur", "1Eur", "50ct", "20ct", "10ct", "5ct", "2ct", "1ct"};

        for (int i = 0; i < muenzen.length; i++) {
            int anzahl = rueck / muenzen[i];
            rueck=rueck%muenzen[i];
            System.out.println(anzahl + " " + bezeichnung[i]);
        }
    }
}
