package basic;

public class KaffeeAutomat {
    public static void main(String[] arg) {

        int preis = 30;

        int gegeben = 200;

        int rest;

        rest = gegeben - preis;

        rest = rest % 100;

        System.out.println("Du bekommst 1Euro und " + rest + "cent wieder.");






    }
}
