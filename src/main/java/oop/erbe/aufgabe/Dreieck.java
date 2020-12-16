package oop.erbe.aufgabe;

public class Dreieck extends Form {

    private int laengeC;

    public Dreieck(){

    }

    public Dreieck(int laengeA, int laengeB, int laengeC){
        super(laengeA, laengeB);
        this.laengeC = laengeC;
    }

    public int getLaengeC() {
        return laengeC;
    }

    public void setLaengeC(int laengeC) {
        this.laengeC = laengeC;
    }

    @Override
    public int berechneUmfang() {
        return super.berechneUmfang() / 2 + laengeC;
    }
}
