package basic.aufgabe3;

public class FibonacciFolge {
    public static void main(String[] args) {
        //Gebe die Fibonacci bis 100 aus
        int ersteZahl = 0;
        int zweiteZahl = 1;
        int dritteZahl = ersteZahl + zweiteZahl;

        System.out.println("Fibonacci Folge");

        while (+dritteZahl <= 100){
            ersteZahl = ersteZahl + zweiteZahl;
            zweiteZahl = zweiteZahl + ersteZahl;
            dritteZahl = ersteZahl + zweiteZahl;
            System.out.println(+ ersteZahl);
            System.out.println(+ zweiteZahl);
            System.out.println(+ dritteZahl);
        }
    }
}
