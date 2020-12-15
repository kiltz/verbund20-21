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
}
