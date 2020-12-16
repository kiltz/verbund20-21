package oop.erbe.aufgabe;

public class Rechteck extends Form {
    public Rechteck(int a, int b) {
        super(a, b);
    }
    public int berechneUmfang(){
        return (2*super.berechneUmfang());
    }
}
