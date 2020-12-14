package basic.aufgabe2;

public class KaffeeAutomat {
    public static void main(String[] args) {

        int preis = 30;

        int gegeben = 200;

        int rückgeld = gegeben - preis;


        int zweieurogeben = rückgeld / 200;
        int rückgeldeuro2 = rückgeld - (200 * zweieurogeben);

        int eineurogeben = rückgeldeuro2 / 100;
        int rückgeldeuro1 = rückgeldeuro2 - (100 * eineurogeben);

        int fünfzigcgeben = rückgeld / 50;
        int rückgeldcent50 = rückgeldeuro1 - (50 * fünfzigcgeben);

        int zwanzigcgeben = rückgeld / 20;
        int rückgeldcent20 = rückgeldcent50 - (20 * zwanzigcgeben);

        int zehncgeben = rückgeld / 10;
        int rückgeldcent10 = rückgeldcent20 - (10 * zehncgeben);

        int fünfcgeben = rückgeld / 5;
        int rückgeldcent5 = rückgeldcent10 - (5 * fünfcgeben);

        int zweicgeben = rückgeld / 5;
        int rückgeldcent2 = rückgeldcent5 - (2 * zweicgeben);

        int eincgeben = rückgeldcent2 / 5;


        System.out.println("Zwei Euro Münze ausgeworfen: "+ zweieurogeben);
        System.out.println("Ein Euro Münze ausgeworfen: "+ eineurogeben);
        System.out.println("50 Cent Münze ausgeworfen: "+ fünfzigcgeben);
        System.out.println("20 Cent Münze ausgeworfen: "+ zwanzigcgeben);
        System.out.println("10 Cent Münze ausgeworfen: "+ zehncgeben);
        System.out.println("5 Cent Münze ausgeworfen: "+ fünfcgeben);
        System.out.println("2 Cent Münze ausgeworfen: "+ zweicgeben);
        System.out.println("1 Cent Münze ausgeworfen: "+ eincgeben);



    }
}
