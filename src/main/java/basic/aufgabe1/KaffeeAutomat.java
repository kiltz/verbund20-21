package basic.aufgabe1;

public class KaffeeAutomat {
    public static void main(String[] args) {
        int preis = 30;
        int gegeben = 200;
        int rueckgeld = gegeben - preis;
        System.out.println(rueckgeld);
        int euroMuenze = rueckgeld % 100; //70
        System.out.println(euroMuenze);
        rueckgeld = rueckgeld - euroMuenze;
        System.out.println(rueckgeld);
        int fuffimuenze = rueckgeld % 50;
        rueckgeld = rueckgeld - fuffimuenze;
        int zwannimuenze = rueckgeld % 20;
        rueckgeld = rueckgeld -  zwannimuenze;
        int zehnermuenze = rueckgeld % 20;
        rueckgeld = rueckgeld -  zehnermuenze;

        System.out.println(rueckgeld + euroMuenze + "1 Euro Münze(n)" + fuffimuenze + "50-Cent Münze(n)" + zwannimuenze +" 20-Cent Münze(n)" + zehnermuenze +"10-Cent Münze(n)" );
    }
}
