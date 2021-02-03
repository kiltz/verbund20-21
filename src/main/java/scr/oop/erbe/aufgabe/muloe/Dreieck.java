package oop.erbe.aufgabe.muloe;

public class Dreieck extends Form {
    private int zahl1;
    private int zahl2;
    private int zahl3;

    public Dreieck(int zahl1, int zahl2, int zahl3) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
        this.zahl3 = zahl3;
    }

    @Override
    public int berechneUmfang() {
        return zahl1+zahl2+zahl3;
    }
}
