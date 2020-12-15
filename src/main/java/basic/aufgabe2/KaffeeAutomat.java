package basic.aufgabe2;

public class KaffeeAutomat {

    public static void main(String[] args) {
        // Angenommen: Ein Kaffee kostet 30 Cent,
        // wir werfen eine 2-Euro Münze in den Automat
        // Welche Münzen bekommen wir als Rückgeld?

        // 1. definiere den Preis und das gezahlte Geld am Anfang der Methode
        int preis = 45;
        int gegeben = 100;
        int[] zahlen = {50,20,10,5};

        // 2. Ermittle mit Hilfe von Modulo die Anzahl der einzelnen
        // 		Münzen und arbeite mit dem Rest weiter.
        int rest = gegeben - preis;
        System.out.println("Rückgeld "+rest);


        for(int i = 0; i < zahlen.length ;i++)
        {
            int anzahl = 0;
            anzahl = rest / zahlen[i];
            rest = rest % zahlen[i];
            System.out.println(anzahl+" "+zahlen[i]+"-Cent-Münzen (Rest: "+rest+")");


        }

    }

}
