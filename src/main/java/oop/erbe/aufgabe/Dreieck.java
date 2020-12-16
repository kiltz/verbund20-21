package oop.erbe.aufgabe;

public class Dreieck extends Form {
    private int hoehe;

    public Dreieck(int l, int b, int h){
        super(l,b);
        hoehe=h;
    }

    public int berechneUmfang(){
        return super.berechneUmfang()+hoehe;
    }
}

