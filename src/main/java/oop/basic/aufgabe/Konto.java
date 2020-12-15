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
        if (kontostand + dispo > betrag){
            kontostand -= betrag;
        }else {
            System.out.println("Betrag nicht auszahlbar!");

        }
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public int getDispo() {
        return dispo;
    }
}
