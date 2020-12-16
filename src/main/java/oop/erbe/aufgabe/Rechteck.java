package oop.erbe.aufgabe;

public class Rechteck extends Form{
    private int seite1 = 0;
    private int seite2 = 0;
    private int umfang = 0;
    public Rechteck(int seite1, int seite2) {
        this.seite1 = seite1;
        this.seite2 = seite2;
    }
    public void berechneUmfang() {
        umfang = seite1 + seite2;
        System.out.println(umfang);
}


}
