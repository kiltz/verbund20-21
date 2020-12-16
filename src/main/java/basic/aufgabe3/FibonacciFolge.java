package basic.aufgabe3;

public class FibonacciFolge {
    public static void main(String[] args) {
        //Gebe die Fibonacci bis 100 aus
        int ersteZahl = 1;
        int zweiteZahl = 0;

        System.out.println("Fibonacci Folge");

        while (ersteZahl < 50){
            ersteZahl = ersteZahl + zweiteZahl;
            zweiteZahl = zweiteZahl + ersteZahl;
            System.out.println(+ ersteZahl);
            System.out.println(+ zweiteZahl);
        }
    }
}
