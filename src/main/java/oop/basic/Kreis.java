package oop.basic;

public class Kreis {

    // Instanzvariable oder auch Eigenschaft
    // Zusicherung: Radius ist größer oder gleich 0
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius >= 0) {
            this.radius = radius;
        } else {
            // Mecker!
        }
    }

    // Parameter
    public Kreis(int radius) {
        this.radius = radius;
    }

    public Kreis() {

    }

    double berechneUmfang() {
        // lokale Variable
        double umfang = 2 * radius * Math.PI;
        return umfang;
    }

    public static class FibonacciFolge {
        public static void main(String[] args) {
            //Gebe die Fibonacci bis 100 aus

            // 0 1 1 2 3 5 8 13
            int zahl1 = 0;
            int zahl2 = 1;
            int zahl3 = zahl1 + zahl2;
            System.out.println(zahl1);
            System.out.println(zahl2);
            System.out.println(zahl3);

            while (zahl3 + zahl2 < 100) {
                zahl1 = zahl2;
                zahl2 = zahl3;
                zahl3 = zahl1 + zahl2;
                System.out.println(zahl3);
            }

        }
    }
}
