package basic.aufgabe3;

public class FibonacciFolge2 {
    public static void main(String[] arg) {

        int zahl1 = 0;
        int zahl2 = 1;
        int zahl3;

        System.out.print(zahl1 + " " + zahl2);

        for(int i = 0;i < 11; i++){
            zahl3 = zahl1 + zahl2;
            if (zahl3 <= 100) {
                System.out.print(" " + zahl3);
                zahl1 = zahl2;
                zahl2 = zahl3;
            }
        }
    }
}
