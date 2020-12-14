package basic.aufgabe1;

public class KaffeeAutomat {
    public static void main(String[] args) {
        int preis = 30;
        int gegeben = 200;
        int rueckgeld1 = gegeben - preis;
        System.out.println(rueckgeld1);
        int euroMuenze = rueckgeld1 % 100; //70
        System.out.println(euroMuenze);
         int rueckgeld2 = rueckgeld1 - euroMuenze;
        System.out.println(rueckgeld2);
        int fuffimuenze = rueckgeld2 % 50;
        int rueckgeld3 = rueckgeld2 - fuffimuenze;
        int zwannimuenze = rueckgeld3 % 20;
        int rueckgeld4 = rueckgeld3 -  zwannimuenze;
        int zehnermuenze = rueckgeld4 % 20;
        int rueckgeld5 = rueckgeld4 -  zehnermuenze;

        System.out.println(rueckgeld1 + euroMuenze + "1 Euro Münze(n)" + fuffimuenze + "50-Cent Münze(n)" + zwannimuenze +" 20-Cent Münze(n)" + zehnermuenze +"10-Cent Münze(n)" );
    }
}
