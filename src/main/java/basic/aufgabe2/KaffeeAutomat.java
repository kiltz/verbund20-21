package basic.aufgabe2;

public class KaffeeAutomat {
    public static void main(String[] args) {
        int preis =38 ;
        int gegeben = 200;
        int restgeld = gegeben - preis;
        restgeld = restgeld%200;
        System.out.println("2 Euro Münzen: "+restgeld%200);
    }
}
