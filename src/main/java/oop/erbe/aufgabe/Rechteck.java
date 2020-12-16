package oop.erbe.aufgabe;

public class Rechteck extends Form{

    public Rechteck() {

    }

    int umfang;

    public Rechteck(int laenge, int breite){
        umfang = 2 * (laenge + breite);
        System.out.println(umfang);
    }
}
