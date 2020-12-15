package basic.aufgabe2;

public class KaffeeAutomat23 {

	public static void main(String[] args) {
		/*
		// Angenommen: Ein Kaffee kostet 30 Cent,
		// wir werfen eine 2-Euro Münze in den Automat
		// Welche Münzen bekommen wir als Rückgeld?

		// 1. definiere den Preis und das gezahlte Geld am Anfang der Methode
		int preis = 45;
		int gegeben = 100;

		// 2. Ermittle mit Hilfe von Modulo die Anzahl der einzelnen
		// 		Münzen und arbeite mit dem Rest weiter.
		int rest = gegeben - preis;
		System.out.println("Rückgeld "+rest);

		// wie viele 1 Euro-Münzen?
		int anzahl = rest / 100;
		rest = rest % 100;
		System.out.println(anzahl+" 1-Euro-Münzen (Rest: "+rest+")");

		// wie viele 50 Cent-Münzen?
		anzahl = rest / 50;
		rest = rest % 50;
		System.out.println(anzahl+" 50-Cent-Münzen (Rest: "+rest+")");

		// wie viele 20 Cent-Münzen?
		anzahl = rest / 20;
		rest = rest % 20;
		System.out.println(anzahl+" 20-Cent-Münzen (Rest: "+rest+")");

		// wie viele 10 Cent-Münzen?
		anzahl = rest / 10;
		rest = rest % 10;
		System.out.println(anzahl+" 10-Cent-Münzen (Rest: "+rest+")");

		// wie viele 5 Cent-Münzen?
		anzahl = rest / 5;
		rest = rest % 5;
		System.out.println(anzahl+" 5-Cent-Münzen (Rest: "+rest+")");


		// 3. Vereinfache die Lösung mit Schleifen
		 */
		int gegeben = 179;
		int preis = 50;

		int rest = gegeben - preis;
		System.out.println("Muenze " + "Anzahl " + "Restbetrag ");
		int [] muenzen = {200, 100,50,20,10,5,2,1};
		for (int m : muenzen) {
			System.out.println(m + "Cent  " + rest / m + "     Rest  " + rest % m);
			rest = rest % m;
		}



	}

}
