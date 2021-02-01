package oop.erbe.aufgabe;

public class Dreieck extends Form {
    private int seite1 = 0;
    private int seite2 = 0;
    private int seite3 = 0;
    private int umfang = 0;

    public Dreieck(int seite1, int seite2, int seite3) {
        this.seite1 = seite1;
        this.seite2 = seite2;
        this.seite3 = seite3;
    }

    public void berechneUmfang() {
        umfang = seite1 + seite2 + seite3;
        System.out.println(umfang);
    }
}
