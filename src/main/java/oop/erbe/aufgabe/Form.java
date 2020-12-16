package oop.erbe.aufgabe;

public class Form {
    public Form(){

    }

    int laenge = 0;
    int breite = 0;
    int hoehe = 0;

    public void berechneUmfang(int laenge, int breite, int hoehe){
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public boolean berechneUmfang() {
        return true;
    }
}
