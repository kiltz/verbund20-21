package oop.basic.aufgabe;

public class Konto {
<<<<<<< HEAD
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
        if(kontostand-output>=-dispo) {
            kontostand -= output;
        } else{
            System.out.println("Sie haben das Dispolimit erreicht, geld wird nicht ausgezahlt");
        }
    }
}
=======

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

    public void auszahlen(int betrag) throws Exception {
        if (kontostand + dispo >= betrag){
            kontostand -= betrag;
        }else {
            throw new Exception("Betrag nicht auszahlbar!");
        }
    }

    public void setDispo(int dispo) {
        this.dispo = dispo;
    }

    public int getDispo() {
        return dispo;
    }
}
>>>>>>> origin/FabianLechner
