package basic.Aufgabe3;

public class KaffeautomatSchleife {
    public static void main(String[] args) {
        int preis = 30;
        int gegeben=250;
        int rueckgeld=gegeben-preis;
        int zweiEuroMuenzen=0;
        int einsEuroMuenzen=0;
        int funfzigctMuenzen=0;
        int zwanzigctMuenzen=0;
        int zehnctMuenzen=0;
        int funfctMuenzen=0;
        int zweictMuenzen=0;
        int einsctMuenzen=0;
        //Variablenanlegen



        //beginn der whileschleife , nur wenn mehr als 0 cent noch da sind
        while(rueckgeld>0) {

            System.out.println(rueckgeld);
            if (rueckgeld >=200) {
                zweiEuroMuenzen=rueckgeld/200;
                rueckgeld = rueckgeld % 200;
            } else if (rueckgeld >= 100) {
                einsEuroMuenzen=rueckgeld/100;
                rueckgeld = rueckgeld % 100;
            } else if (rueckgeld >= 50) {
                funfzigctMuenzen=rueckgeld/50;
                rueckgeld = rueckgeld % 50;
            } else if(rueckgeld>=20){
                zwanzigctMuenzen=rueckgeld/20;
                rueckgeld=rueckgeld%20;
            } else if (rueckgeld >= 10) {
                zehnctMuenzen=rueckgeld/10;
                rueckgeld = rueckgeld % 10;
            } else if (rueckgeld >= 5) {
                funfctMuenzen=rueckgeld/5;
                rueckgeld = rueckgeld % 5;
            } else if (rueckgeld >= 2) {
                zweictMuenzen=rueckgeld/2;
                rueckgeld = rueckgeld % 2;
            } else {
                einsctMuenzen=rueckgeld/1;
                rueckgeld--;
            }

        }
        System.out.println("2€-Muenze: " + zweiEuroMuenzen + " 1€-Muenze: " + einsEuroMuenzen +" 50ct-Muenze: " + funfzigctMuenzen + " 20ct-Muenze: " + zwanzigctMuenzen + "  10ct-Muenze: " + zehnctMuenzen + " 5ct-Muenze:" + funfctMuenzen + " 2ct-Muenze: " + zweictMuenzen + " 1ct-Muenze: " + einsctMuenzen);
    }
}
