package oop.basic.aufgabe;

public class Konto {
    private int Kontostand = 0;
    private int dispo = 0;

    public void setDispo(int einzahlen){
       dispo = dispo + einzahlen;
    }

    public int getDispo(){
        return dispo;
    }
    public int getKontostand(){
        return Kontostand;
    }
    public int einzahlen(int einzahlung){
        Kontostand += einzahlung;
    }

    public int auszahlen(int auszahlung){
        Kontostand -= auszahlung;
    }


}

