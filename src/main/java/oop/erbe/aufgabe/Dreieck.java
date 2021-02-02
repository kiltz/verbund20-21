package oop.erbe.aufgabe;

public class Dreieck extends Form {
    private int seite3;

    public Dreieck(int s1, int s2, int s3){
        super(s1,s2);
        seite3=s3;
    }

    public int berechneUmfang(){
        return super.berechneUmfang()+seite3;
    }
}
