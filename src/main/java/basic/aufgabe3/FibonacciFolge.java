package basic.aufgabe3;

public class FibonacciFolge {
    public static void main(String[] args) {
        //Gebe die Fibonacci bis 100 aus
        int erstezahl = 0;
        int zweitezahl = 1;
        int drittezahl = 0;
        System.out.println(erstezahl);
        System.out.println(zweitezahl);
        while ( drittezahl <= 80) {
            drittezahl = zweitezahl + erstezahl;
            System.out.println(drittezahl);
            erstezahl = zweitezahl;
            zweitezahl = drittezahl;

        }
    }
}
