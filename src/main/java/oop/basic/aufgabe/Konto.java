package oop.basic.aufgabe;

public class Konto {

   private int kontostand ;
   private int dispo;

    Konto(){
    }

    public int getKontostand() {
        return kontostand;
    }

    public void einzahlen(int betrag) {
        if (betrag >= 0) {
            kontostand = kontostand + betrag;
        }else{
            System.out.println("Keine negativen Betraege moeglich!");
        }
    }

    public void auszahlen(int betrag) {
        if (kontostand + dispo >= betrag){
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
