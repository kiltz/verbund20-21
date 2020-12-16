package oop.erbe.aufgabe;

public class Form {

    private int laengeA;
    private int laengeB;


    public Form(){
    }

    public Form(int laengeA, int laengeB){
        this.laengeA = laengeA;
        this.laengeB = laengeB;

    }

    public int getLaengeA() {
        return laengeA;
    }

    public void setLaengeA(int laengeA) {
        this.laengeA = laengeA;
    }

    public int getLaengeB() {
        return laengeB;
    }

    public void setLaengeB(int laengeB) {
        this.laengeB = laengeB;
    }

    public int berechneUmfang() {
        return 2 * laengeA + 2 * laengeB;
    }
}
