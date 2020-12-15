package oop.basic.aufgabe;

public class Konto {
    private int Kontostand = 0;
    private int dispo = 0;

    public void setDispo(int wert){
       dispo += wert;
    }

    public int getDispo(){
        return dispo;
    }
    public int getKontostand(){
        return Kontostand;
    }
    public void einzahlen(int einzahlung){
        Kontostand += einzahlung;
    }

    public void auszahlen(int auszahlung){
        if (Kontostand - auszahlung >= -dispo )
        Kontostand -= auszahlung;
    }
        else {
            System.out.println("Geld Reicht nicht");
    }

}

