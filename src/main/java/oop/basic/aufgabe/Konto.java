package oop.basic.aufgabe;

public class Konto {

    Konto(){
    }

    int kontostand;
    int dispo;

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }


    public int getDispo() {
        return dispo;
    }


    public int getKontostand() {
        return kontostand;
    }

    public void einzahlen(int betrag) {
        kontostand = kontostand + betrag;
    }


    public void auszahlen(int betrag) {
        kontostand = kontostand - betrag;
        if (kontostand < -dispo){
            kontostand = kontostand + betrag;
        }
    }
}
