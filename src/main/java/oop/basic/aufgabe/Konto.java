package oop.basic.aufgabe;

public class Konto {
    private int kontostand;
    private int dispo;
    public int getDispo(){
        return dispo;
    }
    public int getKontostand(){
        return kontostand;
    }
    public void setDispo(int input){
        dispo+=input;
    }
    public void einzahlen(int input){
        kontostand+=input;
    }
    public void auszahlen(int output){
        if(kontostand-output>=-1500) {
            kontostand -= output;
        } else{
            System.out.println("Sie haben das Dispolimit erreicht, geld wird nicht ausgezahlt");
        }
    }
}