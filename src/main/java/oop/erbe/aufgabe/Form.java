package oop.erbe.aufgabe;

public class Form {
    private int seiteA;
    private int seiteB;

    public Form(int seiteA, int seiteB) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
    }

    public int berechneUmfang() {
        return (seiteA + seiteB);
    }
}
