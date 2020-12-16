package basic.aufgabe3;

public class FibonacciFolge {
    public static void main(String[] args) {
        int zahl = 0;
        int zahl1 = 1;
        int zahl2 = 0;
        while ( zahl2 < 100) {
            zahl2 =zahl + zahl1;
            zahl = zahl1;
            zahl1 = zahl2;
            System.out.println(zahl2);
        }
    }
}
