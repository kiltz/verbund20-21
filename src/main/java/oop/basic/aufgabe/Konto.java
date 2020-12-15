package oop.basic.aufgabe;

public class Konto {

    int kontostand ;
    int dispo;

    Konto(){
    }

    public int getKontostand() {
        return kontostand;
    }

    public void einzahlen(int betrag) {
        kontostand = kontostand + betrag;
    }

    public void auszahlen(int betrag) {
        if (kontostand + dispo < betrag){
            System.out.println("Betrag nicht auszahlbar!");
        }else {
            kontostand -= betrag;
        }
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public int getDispo() {
        return dispo;
    }
}
