package oop.basic.aufgabe.muloe;

public class Konto {
    private int dispo;
    private int kontostand;

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
        kontostand += betrag;
    }

    public void auszahlen(int betrag) {
        // -200 - 1300 >= -1500
//        if (kontostand - betrag >= dispo * -1) {
        // -200 + 1500 >= 1301
        if (kontostand + dispo >= betrag) {
            kontostand -= betrag;
        } else {
            System.out.println("Keine Kontodeckung!");
        }
    }
}
