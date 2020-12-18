package oop.erbe.aufgabe;

public class Dreieck extends Form {

    private int seite3;

    public Dreieck(int seite1, int seite2, int seite3){


        super(seite1, seite2);
        this.seite3 = seite3;
    }


    public int getSeite3() {
        return seite3;
    }
    public void setSeite3(int seite3) {
        this.seite3 = seite3;
    }

    @Override
    public int berechneUmfang() {
        return super.berechneUmfang() / 2 + seite3;
    }
}
