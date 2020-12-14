package basic.aufgabe2;

public class KaffeeAutomat {
    public static void main(String[] args) {
        int preis = 30;


        int gegeben=500;

        int rueck=gegeben-preis;

        int rest2EuroMuenzen=0;
        int rest1EuroMuenzen=0;
        int rest50ctMuenzen=0;
        int rest20ctMuenzen=0;
        int rest10ctMuenzen=0;
        int rest5ctMuenzen=0;
        int rest2ctMuenzen=0;
        int rest1ctMuenzen=0;
        while(rueck>0) {

            System.out.println(rueck);
            if (rueck >= 200) {
                rest2EuroMuenzen = rueck / 200;
                rueck = rueck % 200;
            } else if (rueck >= 100) {
                rest1EuroMuenzen = rueck / 100;
                rueck = rueck % 100;
            } else if (rueck >= 50) {
                rest50ctMuenzen = rueck / 50;
                rueck = rueck % 50;
            } else if (rueck >= 20) {
                rest20ctMuenzen = rueck / 20;
                rueck = rueck % 20;
            } else if (rueck >= 10) {
                rest10ctMuenzen = rueck / 10;
                rueck = rueck % 10;
            } else if (rueck >= 5) {
                rest5ctMuenzen = rueck / 5;
                rueck = rueck % 5;
            } else if (rueck >= 2) {
                rest2ctMuenzen = rueck / 2;
                rueck = rueck % 2;
            } else {
                rest1ctMuenzen = rueck / 1;
                rueck--;
            }
        }
        System.out.println("2€: " + rest2EuroMuenzen + " 1€: " + rest1EuroMuenzen +" 50ct: " + rest50ctMuenzen + " 20ct: " + rest20ctMuenzen + "  10ct: " + rest10ctMuenzen + " 5ct:" + rest5ctMuenzen + " 2ct: " + rest2ctMuenzen + " 1ct: " + rest1ctMuenzen);
    }
}
