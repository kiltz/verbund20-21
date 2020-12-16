package basic.aufgabe3;

public class FibonacciFolge3 {
    public static void main(String[] args) {
        int Wiederholung = 100;
        long zahl1 = 0;
        long zahl2 = 1;

        for (int i = 1; i <= Wiederholung; ++i)
        {
            System.out.println(zahl1 + " ");
            long Ergebnis = zahl1 + zahl2;
            zahl1 = zahl2;
            zahl2 = Ergebnis;
            if (zahl1 >= 100)
                break;
        }
    }
}
