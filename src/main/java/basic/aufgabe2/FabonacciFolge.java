package basic.aufgabe2;

public class FabonacciFolge {
    public static void main (String [] args) {
       int[] fib = new int[12];
        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < fib.length; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
        }
    }
}