package basic.aufgabe3;

public class FibonacciFolge {
    public static void main(String[] args) {
        int zahl1 = 0;
        int zahl2 = 1;
        int zahl3 = zahl1 + zahl2;
        System.out.println(zahl1);
        System.out.println(zahl2);
        System.out.println(zahl3);
        while ( zahl3 + zahl2 < 100) {
            zahl1 = zahl2;
            zahl2 = zahl3;
            zahl3 = zahl1 + zahl2;
            System.out.println(zahl3);
        }
    }
}
