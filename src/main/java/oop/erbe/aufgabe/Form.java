package oop.erbe.aufgabe;

public class Form {

    private int seite1;
    private int seite2;

    public Form(){
    }
    public Form(int seite1, int seite2){
        this.seite1 = seite1;
        this.seite2 = seite2;

    }
    public int getSeite1() {
        return seite1;
    }
    public void setSeite1(int seite1) {
        this.seite1 = seite1;
    }
    public int getSeite2() {
        return seite2;
    }
    public void setSeite2(int seite2) {
        this.seite2 = seite2;
    }
    public int berechneUmfang() {
        return 2 * seite1 + 2 * seite2;
    }
}