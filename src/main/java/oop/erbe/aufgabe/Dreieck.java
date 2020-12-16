package oop.erbe.aufgabe;

public class Dreieck extends Form{
    private int seite1;
    private int seite2;
    private int seite3;

    public Dreieck(int seite1, int seite2, int seite3){
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite3;
    }

    @Override
    public int berechneUmfang() {
        return  seite1 + seite2 + seite3;
    }
}
