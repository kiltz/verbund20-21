package oop.erbe.aufgabe;

public class Form {
    private int seiteA;
    private int seiteB;
    private int seiteC;
    public int berechneUmfang(int Umfang) {
        if(seiteC==0){
            Umfang=seiteA*2+seiteB*2;
        }else {
            Umfang = seiteA + seiteB + seiteC;
        }
        return Umfang;
    }
    public Form(int seiteA, int seiteB, int seiteC) {
        this.seiteA = seiteA;
        this.seiteB = seiteB;
        this.seiteC = seiteC;
    }

    public int getSeiteA() {
        return seiteA;
    }

    public void setSeiteA(int seiteA) {
        this.seiteA = seiteA;
    }

    public int getSeiteB() {
        return seiteB;
    }

    public void setSeiteB(int seiteB) {
        this.seiteB = seiteB;
    }

    public int getSeiteC() {
        return seiteC;
    }

    public void setSeiteC(int seiteC) {
        this.seiteC = seiteC;
    }
}
