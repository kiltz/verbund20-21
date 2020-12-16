package basic.aufgabe3;

public class FibonacciFolge {
    public static void main(String[] args) {
        int Wiederholung = 1;
        long zahl1 = 0;
        long zahl2 = 1;

        while(true)
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
