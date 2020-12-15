package oop.basic.aufgabe;

public class Konto {

    Konto(){
    }

    int dispo;
    int kontostand;

    // Soll keinen Wert ausgeben !
    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public int getDispo() {
        return 0;
    }

    public int getKontostand() {
        return 0;
    }

    // Soll keinen Wert ausgeben !
    public void einzahlen(int betrag) {
        kontostand += betrag;
    }

    // Soll keinen Wert ausgeben !
    public void auszahlen(int betrag) {
        if(betrag >= dispo){
            kontostand -= betrag;
            System.out.println("Keine Kontodeckung!");
        }
    }
}
