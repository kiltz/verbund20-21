package oop.erbe.aufgabe;

public class Dreieck extends Form {

    private int c;

    public Dreieck(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int berechneUmfang() {
        return (super.berechneUmfang()+ c);
    }
}
