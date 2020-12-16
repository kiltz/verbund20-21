package basic.aufgabe3;

public class FibonacciFolge {
    public static void main(String[] args) {
        //Gebe die Fibonacci bis 100 aus

            int zahl1 =0;
            int zahl2 =1;
            int zahl3 =0;
        System.out.print(zahl1+" "+zahl2);

           for(int i=0; i<10;i++) {
                zahl3=zahl1+zahl2;
                System.out.print(" "+zahl3);
                zahl1=zahl2;
                zahl2=zahl3;
            }
        }
}
