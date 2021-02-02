package oop.erbe.aufgabe;

public class Form {
    private int seite1;
    private int seite2;

    public Form(int s1, int s2){
        this.seite1=s1;
        this.seite2=s2;
    }

    public int berechneUmfang(){
        return seite1+seite2;
    }
}
