package oop.erbe.aufgabe;

public class Form {
    private int laenge;
    private int breite;

    public Form(int l, int b){
        this.laenge=l;
        this.breite=b;
    }

    public int berechneUmfang(){
        return laenge+breite;
    }
}
