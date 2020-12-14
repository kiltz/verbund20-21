package basic.aufgabe2;

public class KaffeeAutomat {

	public static void main(String[] args) {

		int preis = 30;
		int gegeben = 200;



		int rueckgeld = gegeben - preis;

		System.out.println(rueckgeld);
		//ruckgeld ausgabe


		int euroMuenze = rueckgeld % 100; //70
		System.out.println(euroMuenze);
		rueckgeld = rueckgeld - euroMuenze;
		System.out.println(rueckgeld);
		int fuffimuenze = rueckgeld % 50;
		rueckgeld = rueckgeld - fuffimuenze;
		int zwannimuenze = rueckgeld % 20;
		rueckgeld = rueckgeld -  zwannimuenze;
		int zehnermuenze = rueckgeld % 10;
		rueckgeld = rueckgeld -  zehnermuenze;
		int fuenfermuenze = rueckgeld % 5;
		rueckgeld = rueckgeld - fuenfermuenze;


		System.out.println(rueckgeld + euroMuenze + "1 Euro" + fuffimuenze + "50-Cent )" + zwannimuenze +" 20-Cent " + zehnermuenze +"10-Cent " );
	}

}
