package oop.erbe.aufgabe;

public class Rechteck extends Form{

    public Rechteck(int l, int b){
        super(l,b);
    }

    public int berechneUmfang(){
        return 2*super.berechneUmfang();
    }
}

