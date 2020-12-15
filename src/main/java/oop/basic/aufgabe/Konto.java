package oop.basic.aufgabe;

public class Konto {

    int dispo = 0;
    int kontostand = 0;

    public Konto(){
    }

    public Konto(int dispo, int kontostand){
        this.dispo = dispo;
        this.kontostand = kontostand;
    }

    public int getDispo() {
        return dispo;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }


    public void einzahlen(int kontostand) {
        setKontostand(getKontostand() + kontostand);
    }

    public void auszahlen(int kontostand){
        if(getKontostand() - kontostand < -1500){
            System.out.println("Fehler: Dispo kann nicht ueberzogen werden");
        } else {
            setKontostand(getKontostand() - kontostand);
        }
    }
}
