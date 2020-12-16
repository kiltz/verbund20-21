package oop.erbe.aufgabe;

public class Rechteck extends Form{

    private int umfang;
    private int laenge;
    private int breite;

    public Rechteck(int laenge, int breite){
        this.laenge = laenge;
        this.breite = breite;

        umfang = 2 * (laenge + breite);
        System.out.println(umfang);
    }

    @Override
    public int berechneUmfang() {
        return super.berechneUmfang();
    }
}
