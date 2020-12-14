package basic;

public class DatenTypen {
    public static void main(String[] args) {
        // Deklaration
        int gehalt;
        // Initialisierung
        gehalt = 5000;
        // Deklaration und Initialisierung zusammen
        int teil = 2;

        int haelfte = gehalt * (1 / teil);
        System.out.println(haelfte);

        double netteHaelfte =  gehalt * (1.0 / teil);
        System.out.println(netteHaelfte);

        double d = 10 / 3.0;
        System.out.println(d);

        int anzFlaschen = 250;
        int flaschenPerKarton = 12;

        int anzahlKartons = anzFlaschen / flaschenPerKarton;
        int rest = anzFlaschen % flaschenPerKarton;
        System.out.println(anzahlKartons+" Kartons und ein Rest von "+rest+" Flaschen");

    }

}
