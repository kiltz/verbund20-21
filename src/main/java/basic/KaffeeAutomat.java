package basic;

public class KaffeeAutomat {
    public static void main(String[] arg) {

        // preis fuer den Kaffee 30cent
        int preis = 30;

        // man hat 2Euro gegeben
        int gegeben = 200;

        // rechnung fuer das Rueckgeld
        int rest = gegeben - preis;

        // rechnung fuer Cent
        rest = rest % 100;

        // ausgabe Euro und Cent
        System.out.println("Du bekommst 1Euro und " + rest + "cent wieder.");

    }
}
