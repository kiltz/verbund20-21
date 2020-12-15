package oop.basic.aufgabe;

public class Bank {
    public static void main(String[] args) {
        Konto k = new Konto();
        k.setDispo(1500);
        if (k.getDispo() != 1500) {
            System.out.println("Fehler 1: Dispo stimmt nicht!");
        }

        if (k.getKontostand() != 0) {
            System.out.println("Fehler 2: Kontostand stimmt nicht!");
        }

        k.einzahlen(500);
        if (k.getKontostand() != 500) {
            System.out.println("Fehler 3: Kontostand stimmt nicht!");
        }

        k.auszahlen(200);
        if (k.getKontostand() != 300) {
            System.out.println("Fehler 4: Kontostand stimmt nicht!");
        }
        k.auszahlen(500);
        if (k.getKontostand() != -200) {
            System.out.println("Fehler 5: Kontostand stimmt nicht!");
        }
        k.auszahlen(2500);
        if (k.getKontostand() != -200) {
            System.out.println("Fehler 6: Kontostand stimmt nicht!");
        }


    }
}
class Konto {
    public static void main(String[] args) {
        int kontostand;

        public int getKontostand(){
            return kontostand;
        }

        public void setKontostand(){

        }
        public int auszahlen( int abzug){
            kontostand = kontostand - abzug;
            return kontostand;
        }

        public int einzahlen ( int einzahlung){
            kontostand = kontostand + einzahlung;
            return kontostand;
        }
        public int setDispo ( int Dispo){

            return kontostand;
        }
        public int getDispo () {
            return Dispo;
        }

    }


}


