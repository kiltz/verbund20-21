package oop.basic.aufgabe;

public class Konto {

    private int dispo;
    private int kontostand;

    public Konto(){
    }

    public Konto(int dispo, int kontostand){
        this.dispo = dispo;
        this.kontostand = kontostand;
    }

    public int getDispo() {
        return dispo;
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public int getKontostand() {
        return kontostand;
    }


    public void einzahlen(int betrag) {
        if(betrag > 0) {
            kontostand += betrag;
        }
    }

    public void auszahlen(int betrag){
        if(kontostand + dispo >= betrag){
            kontostand -= betrag;
        }


    }
}
