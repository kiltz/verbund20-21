package oop.erbe.aufgabe;

public class Rechteck extends Form{
    private int laenge;
    private int breite;

    public Rechteck(int laenge, int breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public int berechneUmfang() {
        return 2 * (laenge + breite);
    }
}
