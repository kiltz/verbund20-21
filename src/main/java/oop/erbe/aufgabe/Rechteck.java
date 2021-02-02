package oop.erbe.aufgabe;

public class Rechteck extends Form{

    public Rechteck(int s1, int s2){
        super(s1,s2);
    }

    public int berechneUmfang(){
        return 2*super.berechneUmfang();
    }
}
