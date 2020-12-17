package oop.basic.aufgabe;

public class Konto {

    private int kontostand = 0;
    private int dispo = 0;


    public int getKontostand() {
        return this.kontostand;
    }


    public int getDispo() {
        return this.dispo;
    }


    public void setDispo(int zahl) {
        this.dispo = zahl;
    }


    public void einzahlen(int zahl) {
        this.kontostand += zahl;
        }


    public void auszahlen(int zahl) {
        if (this.kontostand - zahl >= -this.dispo) {
            this.kontostand -= zahl;
        }
        else {
            System.out.println("Bankkonto ungenuegend!");
        }
    }
}
