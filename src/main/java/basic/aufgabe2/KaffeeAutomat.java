package basic.aufgabe2;

public class KaffeeAutomat {

	public static void main(String[] args) {
		// Angenommen: Ein Kaffee kostet 30 Cent,
		int preis = 30;
		// wir werfen eine 2-Euro Münze in den Automat
		int gegeben = 70;
		// Welche Münzen bekommen wir als Rückgeld?
		int Münzen = gegeben - preis;
		int euro1 = 100;
		int euro2 = 200;
		int cent50 = 50;
		int cent20 = 20;
		int cent5 = 5;
		int cent2 = 2;
		int cent1 = 1;

		System.out.println(Münzen + "-2 euro");
		int Restgeld = Münzen % euro2;
		System.out.println(Restgeld + "-1 euro");
		Restgeld = Restgeld % euro1;
		System.out.println(Restgeld + "-50 cent");
		Restgeld = Restgeld % cent50;
		System.out.println(Restgeld + "-20 cent");
		Restgeld = Restgeld % cent20;
		System.out.println(Restgeld);
		Restgeld = Restgeld % cent5;
		System.out.println(Restgeld);
		Restgeld = Restgeld % cent2;
		System.out.println(Restgeld);
		Restgeld = Restgeld % cent1;

		System.out.println(Restgeld);


		// 1. definiere den Preis und das gezahlte Geld am Anfang der Methode

		// 2. Ermittle mit Hilfe von Modulo die Anzahl der einzelnen
		// 		Münzen und arbeite mit dem Rest weiter.

		// 3. Vereinfache die Lösung mit Schleifen


	}

}
